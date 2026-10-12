package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.ForbiddenException;

public class ForbiddenAddConflictsException extends ForbiddenException {
  public ForbiddenAddConflictsException(String message) {
    super(message);
  }
}
