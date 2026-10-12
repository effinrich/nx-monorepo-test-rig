package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.ConflictException;

public class StageConflictException extends ConflictException {
  public StageConflictException() {
    super("stage");
  }
}
