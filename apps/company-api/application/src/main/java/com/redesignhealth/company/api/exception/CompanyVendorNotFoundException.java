package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.NotFoundException;

public class CompanyVendorNotFoundException extends NotFoundException {
  public CompanyVendorNotFoundException() {
    super("Company Vendor");
  }
}
