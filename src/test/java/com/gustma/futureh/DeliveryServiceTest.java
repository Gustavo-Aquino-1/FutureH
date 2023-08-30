package com.gustma.futureh;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.gustma.futureh.dto.DeliveryDto;
import com.gustma.futureh.dto.VideoDto;
import com.gustma.futureh.mock.DeliveryRepositoryMock;
import com.gustma.futureh.mock.DroneRepositoryMock;
import com.gustma.futureh.model.Delivery;
import com.gustma.futureh.service.DeliveryService;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * class DeliveryServiceTest.
 */
public class DeliveryServiceTest {
  
  private DeliveryService service = new DeliveryService(new DeliveryRepositoryMock(),
      new DroneRepositoryMock());
  
  @Test
  public void testCreateDeliveryFail() {
    boolean result = service.create(new DeliveryDto("src/main/viode.mp4", 1, "00000000", 2));
    assertFalse(result);
  }
  
  @Test
  public void testCreateDelivery() {
    boolean result = service.create(new DeliveryDto("src/main/viode.mp4", 5, "00000000", 2));
    assertTrue(result);
  }
  
  @Test
  public void testUpdateDeliveryFail() {
    boolean result = service.update(1, new DeliveryDto("src/main/viode.mp4", 5, "00000000", 2));
    assertFalse(result);
  }
  
  @Test
  public void testUpdateDeliveryFailDroneNoExists() {
    boolean result = service.update(5, new DeliveryDto("src/main/viode.mp4", 1, "00000000", 2));
    assertFalse(result);
  }
  
  @Test
  public void testUpdateDelivery() {
    boolean result = service.update(5, new DeliveryDto("src/main/viode.mp4", 5, "00000000", 2));
    assertTrue(result);
  }
  
  @Test
  public void testGetDelivery() {
    List<Delivery> result = service.get();
    assertEquals(result.size(), 0);
  }
  
  @Test
  public void testDeleteDeliveryFail() {
    boolean result = service.delete(1);
    assertFalse(result);
  }
  
  @Test
  public void testDeleteDelivery() {
    boolean result = service.delete(5);
    assertTrue(result);
  }
  
  @Test
  public void testDeliveryAddVideoFail() {
    boolean result = service.addVideo("src/main/video.mp4", 1);
    assertFalse(result);
  }
  
  @Test
  public void testDeliveryAddVideo() {
    boolean result = service.addVideo("src/main/video.mp4", 5);
    assertTrue(result);
  }
  
  @Test
  public void testDeliveryDownloadVideoFail() {
    VideoDto result = service.downloadVideo(1);
    assertEquals(result.getVideo(), null);
  }
  
  @Test
  public void testDeliveryDownloadVideo() {
    VideoDto result = service.downloadVideo(5);
    assertEquals(result.getVideo(), "/src/main/video.mp4");
  }
}
