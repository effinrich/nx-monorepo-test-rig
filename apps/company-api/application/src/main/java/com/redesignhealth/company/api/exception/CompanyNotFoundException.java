package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.NotFoundException;

public class CompanyNotFoundException extends NotFoundException {
  public CompanyNotFoundException() {
    super("Company");
  }
}
