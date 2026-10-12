package com.acmehealth.company.api.dto;

import com.acmehealth.company.api.client.file.dto.RemoteFile;
import lombok.Getter;

@Getter
public class AssetSummary {
  private String href;
  private String name;

  public static AssetSummary from(RemoteFile remoteFile) {
    var summary = new AssetSummary();
    summary.href = remoteFile.getHref();
    summary.name = remoteFile.getFilename();
    return summary;
  }
}
