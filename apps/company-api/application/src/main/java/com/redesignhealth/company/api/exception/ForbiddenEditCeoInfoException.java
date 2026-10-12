package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.ForbiddenException;

public class ForbiddenEditCeoInfoException extends ForbiddenException {
  public ForbiddenEditCeoInfoException(String message) {
    super(message);
  }
}
