package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.NotFoundException;

public class IpMarketplaceNotFoundException extends NotFoundException {
  public IpMarketplaceNotFoundException() {
    super("IpMarketplace");
  }
}
