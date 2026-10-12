package com.acmehealth.company.api.dto.enums;

import com.acmehealth.company.api.dto.SerializableEnum;

public enum IpMarketplacePreferredTerms implements SerializableEnum {
  EQUITY("Equity"),
  ROYALTIES("Royalties"),
  LICENSURE("Licensure"),
  ACQUISITION("Acquisition"),
  OTHER("Other");

  private final String displayName;

  IpMarketplacePreferredTerms(String displayName) {
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
