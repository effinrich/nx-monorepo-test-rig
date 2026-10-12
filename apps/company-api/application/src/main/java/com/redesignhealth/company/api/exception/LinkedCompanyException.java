package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.BadRequestException;

public class LinkedCompanyException extends BadRequestException {
  public LinkedCompanyException(String message) {
    super(message);
  }
}
