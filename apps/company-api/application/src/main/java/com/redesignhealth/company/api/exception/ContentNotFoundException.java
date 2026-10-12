package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.NotFoundException;

public class ContentNotFoundException extends NotFoundException {
  public ContentNotFoundException() {
    super("Content");
  }
}
