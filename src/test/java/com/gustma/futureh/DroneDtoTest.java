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
    DroneDto droneDto = new DroneDto("LKC-338", "-23.550520", "-46.633308");
    assertEquals(droneDto.getModel(), "LKC-338");
    assertEquals(droneDto.getLatitude(), "-23.550520");
    assertEquals(droneDto.getLongitude(), "-46.633308");
  }
  
  @Test
  public void testSetModelDroneDto() {
    DroneDto droneDto = new DroneDto();
    droneDto.setModel("LKC-338");
    droneDto.setLatitude("-23.550520");
    droneDto.setLongitude("-46.633308");
    assertEquals(droneDto.getModel(), "LKC-338");
    assertEquals(droneDto.getLatitude(), "-23.550520");
    assertEquals(droneDto.getLongitude(), "-46.633308");
  }
}
