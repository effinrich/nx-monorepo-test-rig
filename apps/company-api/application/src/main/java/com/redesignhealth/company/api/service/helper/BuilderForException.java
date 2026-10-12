package com.acmehealth.company.api.service.helper;

import com.acmehealth.company.api.exception.InvalidFieldException;
import com.acmehealth.company.api.exception.dto.FieldErrorDetails;
import com.acmehealth.company.api.exception.dto.FieldErrorType;
import java.util.Objects;

public class BuilderForException {

  public static void buildInvalidFieldException(
      String field, String value, FieldErrorType fieldErrorType) {
    buildInvalidFieldException(field, value, fieldErrorType.getDescription());
  }

  public static void buildInvalidFieldException(String field, String value, String fieldErrorType) {
    var fieldLevelError = buildError(field, value, fieldErrorType);
    throw new InvalidFieldException(fieldLevelError);
  }

  public static FieldErrorDetails buildError(String field, String value, String fieldErrorType) {
    return FieldErrorDetails.builder()
        .name(field)
        .rejectedValue(Objects.toString(value))
        .type(fieldErrorType)
        .build();
  }
}
