package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.NotFoundException;

public class LibraryNotFoundException extends NotFoundException {
  public LibraryNotFoundException() {
    super("Library");
  }
}
