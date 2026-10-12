package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.ForbiddenException;

public class ForbiddenIpMarketplaceException extends ForbiddenException {
  public ForbiddenIpMarketplaceException(String message) {
    super(message);
  }
}
