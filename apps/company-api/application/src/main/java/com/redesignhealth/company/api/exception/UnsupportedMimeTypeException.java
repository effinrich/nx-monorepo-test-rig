package com.acmehealth.company.api.exception;

import com.acmehealth.company.api.exception.status.InternalServerErrorException;
import org.springframework.util.MimeType;

public class UnsupportedMimeTypeException extends InternalServerErrorException {
  public UnsupportedMimeTypeException(MimeType mimeType) {
    super(String.format("Unsupported mime type %s", mimeType));
  }
}
