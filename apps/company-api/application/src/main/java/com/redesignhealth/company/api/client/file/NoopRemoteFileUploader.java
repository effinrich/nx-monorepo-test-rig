package com.acmehealth.company.api.client.file;

import com.acmehealth.company.api.client.file.dto.RemoteFile;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NoopRemoteFileUploader implements RemoteFileUploader {
  @Override
  public RemoteFile upload(String filename, byte[] bytes, String contentType) {
    log.info("Mocking call to upload file={}", filename);
    return RemoteFile.builder().filename(filename).href("https://example.com").build();
  }
}
