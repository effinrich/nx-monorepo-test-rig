package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.NotFoundException;

public class CompanyMemberNotFoundException extends NotFoundException {
  public CompanyMemberNotFoundException() {
    super("Company Member");
  }
}
