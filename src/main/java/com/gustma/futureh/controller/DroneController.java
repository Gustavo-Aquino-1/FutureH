package com.gustma.futureh.controller;

import com.gustma.futureh.dto.DroneDto;
import com.gustma.futureh.model.Drone;
import com.gustma.futureh.service.DroneService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class DroneController.
 */
@RestController
@RequestMapping(value = "/drone", consumes = "application/json", produces = "application/json")
public class DroneController {
  
  @Autowired
  private DroneService service;
  
  @PostMapping()
  public ResponseEntity<?> create(@Valid @RequestBody DroneDto drone) {
    service.create(drone);
    return ResponseEntity.status(200).build();
  }
  
  /**
   * update. 
   */
  @PutMapping("/{id}")
  public ResponseEntity<?> update(@Valid @RequestBody DroneDto drone,
      @PathVariable("id") Integer id) {
    if (service.update(id, drone)) {
      return ResponseEntity.status(200).build();
    }
    return ResponseEntity.status(404).build();
  }
  
  @GetMapping()
  public ResponseEntity<List<Drone>> get() {
    return ResponseEntity.status(200).body(service.get());
  }
}
