package com.acmehealth.company.api.assembler;

import com.acmehealth.company.api.assembler.jira.JiraLinkGenerator;
import com.acmehealth.company.api.controller.PersonRequestController;
import com.acmehealth.company.api.dto.PersonRequestSummary;
import com.acmehealth.company.api.entity.PersonRequest;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

@Component
public class PersonRequestAssembler
    extends RepresentationModelAssemblerSupport<PersonRequest, PersonRequestSummary> {

  private final JiraLinkGenerator jiraLinkGenerator;

  public PersonRequestAssembler(JiraLinkGenerator jiraLinkGenerator) {
    super(PersonRequestController.class, PersonRequestSummary.class);
    this.jiraLinkGenerator = jiraLinkGenerator;
  }

  @Override
  public PersonRequestSummary toModel(PersonRequest personRequest) {
    var summary = PersonRequestSummary.from(personRequest);
    if (null != summary.getJiraIssueId()) {
      summary.add(jiraLinkGenerator.generate(summary.getJiraIssueId()));
    }
    return summary;
  }
}
