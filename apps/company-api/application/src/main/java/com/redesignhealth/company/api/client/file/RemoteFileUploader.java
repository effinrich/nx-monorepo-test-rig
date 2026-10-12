package com.acmehealth.company.api.client.file;

import com.acmehealth.company.api.client.file.dto.RemoteFile;

public interface RemoteFileUploader {
  RemoteFile upload(String filename, byte[] bytes, String contentType);
}
