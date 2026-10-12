package com.acmehealth.company.api.dto.enums;

import com.acmehealth.company.api.dto.SerializableEnum;

public enum IpMarketplaceStatus implements SerializableEnum {
  ACTIVE("Active"),
  DELISTED("Delisted");

  private final String displayName;

  IpMarketplaceStatus(String displayName) {
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
