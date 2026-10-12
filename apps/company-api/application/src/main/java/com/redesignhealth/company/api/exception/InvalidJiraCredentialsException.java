package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.InternalServerErrorException;

public class InvalidJiraCredentialsException extends InternalServerErrorException {
  public InvalidJiraCredentialsException() {
    super("Invalid credentials, check 'jira.username' and 'jira.apiKey' properties");
  }
}
