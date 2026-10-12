package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.NotFoundException;

public class TaskNotFoundException extends NotFoundException {
  public TaskNotFoundException() {
    super("Task");
  }
}
