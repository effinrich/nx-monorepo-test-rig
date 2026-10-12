package com.acmehealth.company.api.client.file.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class RemoteFile {
  private String href;
  private String filename;
}
