package com.gustma.futureh.dto;

/**
 * class DeliveryDto.
 */
public class DeliveryDto {
  private String video;
  private Integer droneId;
  
  public DeliveryDto() {}

  public DeliveryDto(String video, Integer droneId) {
    this.video = video;
    this.droneId = droneId;
  }

  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }

  public Integer getDroneId() {
    return droneId;
  }

  public void setDroneId(Integer droneId) {
    this.droneId = droneId;
  }
}
