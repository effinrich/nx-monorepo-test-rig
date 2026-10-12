package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.ForbiddenException;

public class ForbiddenIpMarketplaceTrackException extends ForbiddenException {
  public ForbiddenIpMarketplaceTrackException(String message) {
    super(message);
  }
}
