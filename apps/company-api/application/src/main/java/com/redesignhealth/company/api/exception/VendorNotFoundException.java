package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.NotFoundException;

public class VendorNotFoundException extends NotFoundException {
  public VendorNotFoundException() {
    super("Vendor");
  }
}
