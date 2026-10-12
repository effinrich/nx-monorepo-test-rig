package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.NotFoundException;

public class ConsentNotFoundException extends NotFoundException {

  public ConsentNotFoundException() {
    super("Consent");
  }
}
