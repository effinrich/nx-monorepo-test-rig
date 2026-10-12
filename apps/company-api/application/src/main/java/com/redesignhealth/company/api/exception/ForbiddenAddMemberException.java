package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.ForbiddenException;

public class ForbiddenAddMemberException extends ForbiddenException {
  public ForbiddenAddMemberException(String message) {
    super(message);
  }
}
