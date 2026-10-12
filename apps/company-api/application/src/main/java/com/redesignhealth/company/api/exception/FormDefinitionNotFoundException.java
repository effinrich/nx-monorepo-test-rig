package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.NotFoundException;

public class FormDefinitionNotFoundException extends NotFoundException {
  public FormDefinitionNotFoundException() {
    super("Form definition");
  }
}
