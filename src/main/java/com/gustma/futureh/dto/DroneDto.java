package com.gustma.futureh.dto;


import javax.validation.constraints.NotBlank;

/**
 * class DroneDto.
 */
public class DroneDto {

  @NotBlank
  private String model;

  public DroneDto() {}
  
  public DroneDto(String model) {
    this.model = model;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }
}
