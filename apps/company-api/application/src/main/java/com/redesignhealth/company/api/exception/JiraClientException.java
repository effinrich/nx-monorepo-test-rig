package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.client.jira.ErrorCollection;
import com.acmehealth.company.api.exception.status.BadRequestException;

public class JiraClientException extends BadRequestException {

  public JiraClientException(ErrorCollection errorCollection) {
    super(errorCollection.toString());
  }
}
