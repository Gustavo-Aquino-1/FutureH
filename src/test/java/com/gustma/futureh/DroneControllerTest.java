package com.gustma.futureh;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.gustma.futureh.controller.DroneController;
import com.gustma.futureh.service.DroneService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


/**
 * class DroneControllerTest.
 */
@WebMvcTest(DroneController.class)
public class DroneControllerTest {

  @Autowired
  private MockMvc mockMvc;
  
  @MockBean
  private DroneService droneService;
  
  @Test
  public void testGetDrone() throws Exception {
    mockMvc.perform(get("/drone"))
        .andExpect(status().isOk());
  }
  
  @Test
  public void testCreateDrone() throws Exception {
    String drone = "{\"model\": \"KPC-338\"}";
    mockMvc.perform(post("/drone")
        .contentType("application/json")
        .content(drone))
        .andExpect(status().isCreated());
  }
  
  @Test
  public void testCreateDroneFail() throws Exception {
    String drone = "{}";
    mockMvc.perform(post("/drone")
        .contentType("application/json")
        .content(drone))
        .andExpect(status().isBadRequest());
  }
  
  @Test
  public void testUpdateDroneFail() throws Exception {
    String drone = "{\"model\": \"KPC-338\"}";
    mockMvc.perform(post("/drone")
        .contentType("application/json")
        .content(drone))
        .andExpect(status().isCreated());
        
    String droneAtt = "{\"model\": \"DDL-142\"}";
    mockMvc.perform(put("/drone/100")
        .contentType("application/json")
        .content(droneAtt))
        .andExpect(status().isNotFound());
  }
  
  
  @Test
  public void testDeleteDroneFail() throws Exception {
    String drone = "{\"model\": \"KPC-338\"}";
    mockMvc.perform(post("/drone")
        .contentType("application/json")
        .content(drone))
        .andExpect(status().isCreated());
        
    mockMvc.perform(delete("/drone/100"))
        .andExpect(status().isNotFound());
  }
}
