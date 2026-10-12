package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.NotFoundException;

public class InfraRequestNotFoundException extends NotFoundException {
  public InfraRequestNotFoundException() {
    super("Infra request");
  }
}
