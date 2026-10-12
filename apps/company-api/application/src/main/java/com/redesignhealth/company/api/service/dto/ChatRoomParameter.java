package com.acmehealth.company.api.service.dto;

import com.acmehealth.company.api.entity.IpMarketplaceTrack;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ChatRoomParameter {
  private IpMarketplaceTrack ipMarketplaceTrack;
  private String username;
  private String password;
  private String roomName;

  public static ChatRoomParameter of(
      IpMarketplaceTrack ipMarketplaceTrack, String idToken, String accessToken, String roomName) {
    return new ChatRoomParameter(ipMarketplaceTrack, idToken, accessToken, roomName);
  }

  public static ChatRoomParameter of() {
    return new ChatRoomParameter(null, null, null, null);
  }
}
