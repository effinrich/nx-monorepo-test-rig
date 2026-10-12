package com.acmehealth.company.api.expansion;

import com.acmehealth.company.api.exception.status.BadRequestException;

public class UnsupportedSortPropertyException extends BadRequestException {
  public UnsupportedSortPropertyException(String property) {
    super(String.format("Cannot sort by property %s", property));
  }
}
