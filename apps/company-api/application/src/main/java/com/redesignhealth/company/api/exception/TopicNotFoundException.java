package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.NotFoundException;

public class TopicNotFoundException extends NotFoundException {

  public TopicNotFoundException() {
    super("Topic");
  }
}
