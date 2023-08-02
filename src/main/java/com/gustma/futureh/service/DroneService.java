package com.gustma.futureh.service;

import com.gustma.futureh.dto.DroneDto;
import com.gustma.futureh.model.Drone;
import com.gustma.futureh.repository.DroneRepository;
import java.util.List;
import java.util.Optional;
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
  
  
  /**
   * update.
   */
  public boolean update(Integer id, DroneDto drone) {
    Optional<Drone> findDrone = repo.findById(id);
    if (findDrone.isEmpty()) {
      return false;
    }
    Drone attDrone = findDrone.get();
    attDrone.setModel(drone.getModel());
    repo.save(attDrone);
    return true;
  }
  
  
  /**
   * get.
   */
  public List<Drone> get() {
    return repo.findAll();
  }
  
  /**
   * delete.
   */
  public boolean delete(Integer id) {
    Optional<Drone> findDrone = repo.findById(id);
    if (findDrone.isEmpty()) {
      return false;
    }
    repo.deleteById(id);
    return true;
  }
}
