package com.acmehealth.company.api.dto.enums;

import com.acmehealth.company.api.dto.SerializableEnum;

public enum CompanyVendorEngagementStatus implements SerializableEnum {
  ACTIVE("Active"),
  CONSIDERED("Considered"),
  FORMER("Former");

  private final String displayName;

  CompanyVendorEngagementStatus(String displayName) {
    this.displayName = displayName;
  }

  @Override
  public String getValue() {
    return this.name();
  }

  @Override
  public String getDisplayName() {
    return this.displayName;
  }
}
