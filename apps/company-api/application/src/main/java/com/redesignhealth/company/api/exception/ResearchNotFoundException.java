package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.NotFoundException;

public class ResearchNotFoundException extends NotFoundException {

  public ResearchNotFoundException() {
    super("Research");
  }
}
