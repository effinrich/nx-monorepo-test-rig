package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.ForbiddenException;

public class ForbiddenPersonInfoException extends ForbiddenException {
  public ForbiddenPersonInfoException(String message) {
    super(message);
  }
}
