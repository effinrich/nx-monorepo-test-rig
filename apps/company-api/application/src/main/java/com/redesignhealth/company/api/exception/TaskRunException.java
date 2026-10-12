package com.acmehealth.company.api.exception;

public class TaskRunException extends RuntimeException {
  public TaskRunException(String message) {
    super("Running a task happened a problem:" + message);
  }
}
