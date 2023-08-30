package com.gustma.futureh.dto;


import javax.validation.constraints.NotBlank;

/**
 * class DroneDto.
 */
public class DroneDto {

  @NotBlank
  private String model;
  
  @NotBlank
  private String latitude;
  
  @NotBlank
  private String longitude;

  public DroneDto() {}
  
  /**
   * constructor DroneDto.
   */
  public DroneDto(String model, String latitude,  String longitude) {
    this.model = model;
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }
}
