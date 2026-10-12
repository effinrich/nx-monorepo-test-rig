package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.NotFoundException;

public class CeoNotFoundException extends NotFoundException {
  public CeoNotFoundException() {
    super("Ceo");
  }
}
