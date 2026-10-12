package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.entity.FormDefinition;
import com.acmehealth.company.api.exception.status.BadRequestException;
import java.util.Set;

public class RequiredFormsMissingException extends BadRequestException {

  public RequiredFormsMissingException(Set<FormDefinition.Type> missingForms) {
    super(
        "Infrastructure request cannot be submitted until the following forms are completed: "
            + String.join(", ", missingForms.stream().map(Enum::name).toList()));
  }
}
