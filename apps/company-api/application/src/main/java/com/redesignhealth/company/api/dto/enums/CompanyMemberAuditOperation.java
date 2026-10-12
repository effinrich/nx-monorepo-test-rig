package com.acmehealth.company.api.dto.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import com.acmehealth.company.api.dto.SerializableEnum;

public enum CompanyMemberAuditOperation implements SerializableEnum {
  INSERT("Insert"),
  UPDATE("Update"),
  DELETE("Delete"),
  DELETE_BY_COMPANY("Delete_By_Company"),
  UPDATE_BY_COMPANY("Update_By_Company");

  private final String displayName;

  CompanyMemberAuditOperation(String displayName) {
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
