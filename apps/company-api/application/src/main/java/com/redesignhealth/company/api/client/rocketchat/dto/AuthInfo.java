package com.acmehealth.company.api.client.rocketchat.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AuthInfo {
  private String userId;
  private String authToken;
}
