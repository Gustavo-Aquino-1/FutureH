package com.gustma.futureh.controller;

import com.gustma.futureh.dto.DroneDto;
import com.gustma.futureh.service.DroneService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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
}
