package com.gustma.futureh;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.gustma.futureh.controller.DeliveryController;
import com.gustma.futureh.service.DeliveryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


/**
 * class DeliveryControllerTest.
 */
@WebMvcTest(DeliveryController.class)
public class DeliveryControllerTest {

  @Autowired
  private MockMvc mockMvc;
  
  @MockBean
  private DeliveryService deliveryService;
  
  @Test
  public void testGetDelivery() throws Exception {
    mockMvc.perform(get("/delivery"))
        .andExpect(status().isOk());
  }
  
  @Test
  public void testCreateDelivery() throws Exception {
    String delivery = "{\"droneId\": \"1\"}";
    mockMvc.perform(post("/delivery")
        .contentType("application/json")
        .content(delivery))
        .andExpect(status().isCreated());
  }
  
  @Test
  public void testCreateDeliveryFail() throws Exception {
    String delivery = "{\"droneId\": \"abc\"}";
    mockMvc.perform(post("/delivery")
        .contentType("application/json")
        .content(delivery))
        .andExpect(status().isBadRequest());
  }
  
  @Test
  public void testUpdateDeliveryFail() throws Exception {
    String delivery = "{\"droneId\": \"100\"}";
    
    mockMvc.perform(put("/delivery/100")
        .contentType("application/json")
        .content(delivery))
        .andExpect(status().isNotFound());
  }
  
  @Test
  public void testDeleteDeliveryFail() throws Exception {    
    mockMvc.perform(delete("/delivery/1000"))
        .andExpect(status().isNotFound());
  }
  
  
  @Test
  public void testAddVideoFail() throws Exception {
    String video = "{\"video\": \"src/videos/video.mp4\"}";
    mockMvc.perform(post("/delivery/add/video/100")
        .contentType("application/json")
        .content(video))
        .andExpect(status().isNotFound());
  }
  
  @Test
  public void testGetVideo() throws Exception {
    mockMvc.perform(get("/delivery/videos"))
        .andExpect(status().isOk());
  }
  
  @Test
  public void testDownloadVideo() throws Exception {
    mockMvc.perform(get("/delivery/download/video/1"))
        .andExpect(status().isOk());
  }
}
