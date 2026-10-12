package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.BadRequestException;

public class InfraRequestAlreadySubmittedException extends BadRequestException {
  public InfraRequestAlreadySubmittedException() {
    super("Infrastructure request already submitted");
  }
}
