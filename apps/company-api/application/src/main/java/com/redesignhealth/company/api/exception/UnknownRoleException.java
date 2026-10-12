package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.entity.request.RoleAuthority;
import com.acmehealth.company.api.exception.status.BadRequestException;

public class UnknownRoleException extends BadRequestException {

  public UnknownRoleException(RoleAuthority authority) {
    super(String.format("Unknown role %s", authority));
  }
}
