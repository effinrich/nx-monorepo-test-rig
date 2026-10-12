package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.entity.ref.CompanyRef;
import com.acmehealth.company.api.exception.status.BadRequestException;

public class UnknownCompanyException extends BadRequestException {

  public UnknownCompanyException(CompanyRef apiId) {
    super(String.format("Unknown company %s", apiId.value()));
  }
}
