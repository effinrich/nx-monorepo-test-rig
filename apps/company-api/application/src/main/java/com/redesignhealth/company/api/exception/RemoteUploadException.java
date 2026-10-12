package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.InternalServerErrorException;

public class RemoteUploadException extends InternalServerErrorException {
  public RemoteUploadException(Exception e) {
    super(e);
  }
}
