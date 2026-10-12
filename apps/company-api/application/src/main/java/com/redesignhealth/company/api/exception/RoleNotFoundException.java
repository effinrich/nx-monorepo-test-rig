package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.NotFoundException;

public class RoleNotFoundException extends NotFoundException {
  public RoleNotFoundException() {
    super("Role");
  }
}
