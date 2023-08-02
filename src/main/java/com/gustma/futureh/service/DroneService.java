package com.gustma.futureh.service;

import com.gustma.futureh.dto.DroneDto;
import com.gustma.futureh.model.Drone;
import com.gustma.futureh.repository.DroneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * class DroneService.
 */
@Service
public class DroneService {
  @Autowired
  private DroneRepository repo;
  
  /**
   * create.
   */
  public void create(DroneDto drone) {
    Drone newDrone = new Drone();
    newDrone.setModel(drone.getModel());
    repo.save(newDrone);
  }
}
