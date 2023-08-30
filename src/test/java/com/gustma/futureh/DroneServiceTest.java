package com.gustma.futureh;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.gustma.futureh.dto.DroneDto;
import com.gustma.futureh.mock.DroneRepositoryMock;
import com.gustma.futureh.model.Drone;
import com.gustma.futureh.service.DroneService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * class DroneServiceTest.
 */
public class DroneServiceTest {
  
  DroneService service = new DroneService(new DroneRepositoryMock());
  
  @Test
  public void testCreateDrone() {
    DroneDto droneDto = new DroneDto("YT8-9BN");
    boolean result = service.create(droneDto);
    assertTrue(result);
  }
  
  @Test
  public void testGetDrone() {
    List<Drone> result = service.get();
    assertEquals(result.size(), 0);
  }
  
  @Test
  public void updateDroneFail() {
    DroneDto droneDto = new DroneDto("YYT-K26");
    boolean result = service.update(1, droneDto);
    assertFalse(result);
  }
  
  @Test
  public void updateDrone() {
    DroneDto droneDto = new DroneDto("YYT-K26");
    boolean result = service.update(5, droneDto);
    assertTrue(result);
  }
  
  @Test
  public void deleteDroneFail() {
    boolean result = service.delete(1);
    assertFalse(result);
  }
  
  @Test
  public void deleteDrone() {
    boolean result = service.delete(5);
    assertTrue(result);
  }

}
