package com.acmehealth.company.api.scaffolding;

import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;

import com.acmehealth.company.api.assembler.google.OnboardDocsLinkGenerator;
import com.acmehealth.company.api.assembler.google.XCloudCrmLinkGenerator;
import com.acmehealth.company.api.assembler.jira.JiraLinkGenerator;
import com.acmehealth.company.api.config.SecurityConfig;
import com.acmehealth.company.api.property.ExpertNoteEntityConverter;
import com.acmehealth.company.api.property.JiraClientProperties;
import com.acmehealth.company.api.property.ResearchEntityConverter;
import com.acmehealth.company.api.security.AuthChecksService;
import com.acmehealth.company.api.service.RedesignUserDetailsService;
import com.acmehealth.company.api.taxonomy.CompanyTaxonomy;
import org.mockito.Mockito;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.autoconfigure.restdocs.RestDocsMockMvcConfigurationCustomizer;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@TestConfiguration
@Import({SecurityConfig.class})
@EnableConfigurationProperties({
  ResearchEntityConverter.class,
  ExpertNoteEntityConverter.class,
  CompanyTaxonomy.class
})
public class CommonTestConfig {
  @Bean
  public RedesignUserDetailsService acmeUserDetailsService() {
    return Mockito.mock(RedesignUserDetailsService.class);
  }

  @Bean
  public JiraLinkGenerator jiraLinkGenerator() {
    return new JiraLinkGenerator(
        new JiraClientProperties(
            true, "test@example.com", "REDACTED", "https://acmehealth.atlassian.net"));
  }

  @Bean
  public OnboardDocsLinkGenerator onboardDocsLinkGenerator() {
    return new OnboardDocsLinkGenerator("https://example.com");
  }

  @Bean
  public XCloudCrmLinkGenerator xCloudCrmLinkGenerator() {
    return new XCloudCrmLinkGenerator("https://example.com");
  }

  @Bean
  public RestDocsMockMvcConfigurationCustomizer configurer() {
    return c ->
        c.operationPreprocessors()
            .withRequestDefaults(prettyPrint())
            .withResponseDefaults(prettyPrint());
  }

  @Bean
  public AuthChecksService authChecks() {
    return new AuthChecksService();
  }
}
