package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.NotFoundException;

public class PersonNotFoundException extends NotFoundException {
  public PersonNotFoundException() {
    super("Person");
  }
}
