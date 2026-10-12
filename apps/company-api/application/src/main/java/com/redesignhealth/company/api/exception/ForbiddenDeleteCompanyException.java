package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.ForbiddenException;

public class ForbiddenDeleteCompanyException extends ForbiddenException {
  public ForbiddenDeleteCompanyException(String message) {
    super(message);
  }
}
