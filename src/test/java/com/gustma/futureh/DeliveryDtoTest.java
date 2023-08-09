package com.gustma.futureh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.gustma.futureh.dto.DeliveryDto;
import org.junit.jupiter.api.Test;


/**
 * class DeliveryDtoTest.
 */
public class DeliveryDtoTest {
  
  @Test
  public void testCreateDeliveryDto() {
    DeliveryDto deliveryDto = new DeliveryDto("src/videos/video.mp4", 1);
    assertEquals(deliveryDto.getVideo(), "src/videos/video.mp4");
    assertEquals(deliveryDto.getDroneId(), 1);
  }
  
  @Test
  public void testSetDroneIdDeliveryDto() {
    DeliveryDto deliveryDto = new DeliveryDto();
    deliveryDto.setDroneId(1);
    deliveryDto.setVideo("src/videos/video.mp4");
    assertEquals(deliveryDto.getVideo(), "src/videos/video.mp4");
    assertEquals(deliveryDto.getDroneId(), 1);
  }
}
