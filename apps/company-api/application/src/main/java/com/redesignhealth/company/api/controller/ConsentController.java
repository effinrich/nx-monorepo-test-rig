package com.acmehealth.company.api.controller;

import com.acmehealth.company.api.assembler.ConsentAssembler;
import com.acmehealth.company.api.dto.ConsentSummary;
import com.acmehealth.company.api.entity.Consent;
import com.acmehealth.company.api.openapi.IncludeSecurityHeaders;
import com.acmehealth.company.api.service.ConsentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@IncludeSecurityHeaders
@Tag(name = "Account Consent Forms")
public class ConsentController {
  private final ConsentAssembler consentAssembler;
  private final ConsentService consentService;

  public ConsentController(ConsentService consentService) {
    this.consentService = consentService;
    this.consentAssembler = new ConsentAssembler();
  }

  @PutMapping("/me/consent/{type}")
  public ConsentSummary upsertConsent(
      @PathVariable Consent.Type type, @RequestBody ConsentCommand command) {
    return consentAssembler.toModel(consentService.upsert(type, command));
  }

  @GetMapping("/me/consent/{type}")
  public ConsentSummary getConsent(@PathVariable Consent.Type type) {
    return consentAssembler.toModel(consentService.get(type));
  }
}
