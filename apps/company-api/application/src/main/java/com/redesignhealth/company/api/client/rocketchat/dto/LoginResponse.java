package com.acmehealth.company.api.client.rocketchat.dto;

import lombok.Getter;

@Getter
public class LoginResponse {
  private String status;
  private DataResponse data;
}
