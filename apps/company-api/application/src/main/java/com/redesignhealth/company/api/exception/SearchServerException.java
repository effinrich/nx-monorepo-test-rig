package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.InternalServerErrorException;

public class SearchServerException extends InternalServerErrorException {
  public SearchServerException(Exception e) {
    super(e);
  }
}
