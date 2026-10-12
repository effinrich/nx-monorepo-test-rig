package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.NotFoundException;

public class CategoryNotFoundException extends NotFoundException {
  public CategoryNotFoundException() {
    super("Category");
  }
}
