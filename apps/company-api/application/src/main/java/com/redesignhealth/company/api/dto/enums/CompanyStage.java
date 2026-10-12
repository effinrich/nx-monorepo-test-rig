package com.acmehealth.company.api.dto.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import com.acmehealth.company.api.dto.SerializableEnum;

public enum CompanyStage implements SerializableEnum {
  THEME("Theme"),
  CONCEPT("Concept"),
  NEW_CO("NewCo"),
  OP_CO("OpCo");

  private final String displayName;

  CompanyStage(String displayName) {
    this.displayName = displayName;
  }

  @Override
  @JsonValue
  public String getValue() {
    return this.name();
  }

  @Override
  public String getDisplayName() {
    return this.displayName;
  }
}
