package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.NotFoundException;

public class IpMarketplaceTrackNotFoundException extends NotFoundException {
  public IpMarketplaceTrackNotFoundException() {
    super("IpMarketplaceTrack");
  }
}
