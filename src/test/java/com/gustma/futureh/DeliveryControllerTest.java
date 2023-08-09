package com.gustma.futureh;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.gustma.futureh.controller.DeliveryController;
import com.gustma.futureh.controller.DroneController;
import com.gustma.futureh.service.DeliveryService;
import com.gustma.futureh.service.DroneService;
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
}
