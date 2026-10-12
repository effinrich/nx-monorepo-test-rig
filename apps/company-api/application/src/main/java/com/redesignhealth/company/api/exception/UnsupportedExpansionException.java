package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.BadRequestException;
import com.acmehealth.company.api.expansion.Expansion;

public class UnsupportedExpansionException extends BadRequestException {

  public UnsupportedExpansionException(Expansion expansion) {
    super(String.format("?expand=%s is not supported for this entity", expansion.name()));
  }
}
