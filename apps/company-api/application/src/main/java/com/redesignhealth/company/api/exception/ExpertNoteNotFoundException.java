package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.NotFoundException;

public class ExpertNoteNotFoundException extends NotFoundException {
  public ExpertNoteNotFoundException() {
    super("Expert Note");
  }
}
