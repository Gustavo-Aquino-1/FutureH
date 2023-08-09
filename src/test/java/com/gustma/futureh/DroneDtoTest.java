package com.gustma.futureh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.gustma.futureh.dto.DroneDto;
import org.junit.jupiter.api.Test;


/**
 * class DroneDtoTest.
 */
public class DroneDtoTest {
  
  @Test
  public void testCreateDroneDto() {
    DroneDto droneDto = new DroneDto("LKC-338");
    assertEquals(droneDto.getModel(), "LKC-338");
  }
  
  @Test
  public void testSetModelDroneDto() {
    DroneDto droneDto = new DroneDto();
    droneDto.setModel("LKC-338");
    assertEquals(droneDto.getModel(), "LKC-338");
  }
}
