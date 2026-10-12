package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.ForbiddenException;

public class ForbiddenCompanyVendorException extends ForbiddenException {
  public ForbiddenCompanyVendorException(String message) {
    super(message);
  }
}
