package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.NotFoundException;

public class SubcategoryNotFoundException extends NotFoundException {
  public SubcategoryNotFoundException() {
    super("Subcategory");
  }
}
