package com.acmehealth.company.api.client.file.dto;

/** Add type-safety to map between enums and Google Drive APIs raw {@link String} parameters. */
public interface JsonEnum {
  String jsonValue();
}
