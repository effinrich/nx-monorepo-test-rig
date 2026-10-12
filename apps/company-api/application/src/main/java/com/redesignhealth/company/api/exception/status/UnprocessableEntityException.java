package com.acmehealth.company.api.exception.status;

import com.acmehealth.company.api.exception.dto.FieldErrorDetails;
import org.springframework.http.HttpStatus;

public abstract class UnprocessableEntityException extends BaseHttpException {

  private final FieldErrorDetails[] fieldErrorDetails;

  public UnprocessableEntityException(FieldErrorDetails... fieldErrorDetails) {
    super(HttpStatus.UNPROCESSABLE_ENTITY, "Invalid field values");
    this.fieldErrorDetails = fieldErrorDetails;
  }

  public FieldErrorDetails[] getFieldErrorDetails() {
    return fieldErrorDetails;
  }
}
