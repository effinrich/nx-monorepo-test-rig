package com.acmehealth.company.api.client.rocketchat.dto;

import java.util.Map;
import lombok.Getter;

@Getter
public class CreateRoomResponse {
  private boolean success;
  private Map<String, Object> group;
}
