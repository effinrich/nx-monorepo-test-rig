package com.acmehealth.company.api.dto.enums;

import com.acmehealth.company.api.dto.SerializableEnum;

public enum RemoteContentSource implements SerializableEnum {
  GOOGLE_DRIVE("Google Drive"),
  MKDOCS("MkDocs");

  private final String displayName;

  RemoteContentSource(String displayName) {
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
