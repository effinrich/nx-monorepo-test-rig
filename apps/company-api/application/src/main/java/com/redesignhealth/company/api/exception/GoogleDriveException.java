package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.InternalServerErrorException;

public class GoogleDriveException extends InternalServerErrorException {

  public GoogleDriveException(String message) {
    super(message);
  }

  public GoogleDriveException(Exception e) {
    super(e);
  }
}
