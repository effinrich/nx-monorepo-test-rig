package com.acmehealth.company.api.security;

import com.acmehealth.company.api.entity.ref.PersonRef;
import com.acmehealth.company.api.entity.request.RoleAuthority;
import com.acmehealth.company.api.service.RedesignUserDetailsService;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

/** Use a Json Web Token (JWT) to determine whether a request is authenticated */
@Component
public class JwtAuthenticationProvider implements AuthenticationProvider {

  private final JwtService jwtService;
  private final RedesignUserDetailsService acmeUserDetailsService;

  public JwtAuthenticationProvider(
      JwtService jwtService, RedesignUserDetailsService acmeUserDetailsService) {
    this.jwtService = jwtService;
    this.acmeUserDetailsService = acmeUserDetailsService;
  }

  @Override
  public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    var jwtAuth = (JwtAuthentication) authentication;
    var jwt = jwtAuth.getRef();

    var payload = jwtService.verify(jwt).orElse(null);

    if (null == payload) {
      throw new AccountExpiredException("JWT failed verification");
    }

    if (!payload.containsKey("email")) {
      throw new InsufficientAuthenticationException("\"email\" field missing in JWT");
    }

    var jwtEmail = PersonRef.of((String) payload.get("email"));
    var principal = reconcilePrincipal(jwtEmail, jwtAuth.getImpersonationRequest());
    principal.setMetadata(payload);

    return new JwtAuthentication(principal);
  }

  private RedesignUserDetails reconcilePrincipal(
      PersonRef jwtEmail, PersonRef impersonationRequest) {
    var personMakingRequest = acmeUserDetailsService.loadUserByUsername(jwtEmail);

    if (null != impersonationRequest) {
      if (personMakingRequest
          .getAuthorities()
          .contains(new SimpleGrantedAuthority(RoleAuthority.ROLE_SUPER_ADMIN.name()))) {
        return acmeUserDetailsService.loadUserByUsername(impersonationRequest);
      } else {
        throw new InsufficientAuthenticationException(
            String.format("Cannot impersonate %s with this level of access", impersonationRequest));
      }
    }
    return personMakingRequest;
  }

  @Override
  public boolean supports(Class<?> authentication) {
    return JwtAuthentication.class.equals(authentication);
  }
}
