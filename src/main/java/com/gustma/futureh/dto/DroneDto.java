package com.gustma.futureh.dto;

import com.gustma.futureh.model.Delivery;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
