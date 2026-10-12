package com.acmehealth.company.api.config;

import com.acmehealth.company.api.client.jira.JiraClient;
import com.acmehealth.company.api.client.jira.JiraClientImpl;
import com.acmehealth.company.api.client.jira.NoopJiraClient;
import com.acmehealth.company.api.property.JiraClientProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class JiraConfig {

  @Bean
  @ConditionalOnProperty(name = "jira.enabled")
  public JiraClient jiraClientImpl(JiraClientProperties properties) {
    var client =
        WebClient.builder()
            .baseUrl(properties.getHost())
            .defaultHeaders(
                headers -> headers.setBasicAuth(properties.getUsername(), properties.getApiKey()))
            .build();
    return new JiraClientImpl(client);
  }

  @Bean
  @ConditionalOnProperty(name = "jira.enabled", havingValue = "false", matchIfMissing = true)
  public JiraClient noopJiraClient() {
    return new NoopJiraClient();
  }
}
