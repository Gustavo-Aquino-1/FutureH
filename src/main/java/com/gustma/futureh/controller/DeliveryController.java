package com.gustma.futureh.controller;

import com.gustma.futureh.dto.DeliveryDto;
import com.gustma.futureh.dto.DroneDto;
import com.gustma.futureh.dto.VideoDto;
import com.gustma.futureh.model.Delivery;
import com.gustma.futureh.model.Drone;
import com.gustma.futureh.service.DeliveryService;
import com.gustma.futureh.service.DroneService;
import java.util.List;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class DeliveryController.
 */
@RestController
@RequestMapping(value = "/delivery", produces = "application/json")
public class DeliveryController {
  
  @Autowired
  private DeliveryService service;
  
  @PostMapping(consumes = "application/json")
  public ResponseEntity<?> create(@Valid @RequestBody DeliveryDto delivery) {
    service.create(delivery);
    return ResponseEntity.status(200).build();
  }
  
  /**
   * update. 
   */
  @PutMapping(value = "/{id}", consumes = "application/json")
  public ResponseEntity<?> update(@Valid @RequestBody DeliveryDto delivery,
      @PathVariable("id") Integer id) {
    if (service.update(id, delivery)) {
      return ResponseEntity.status(200).build();
    }
    return ResponseEntity.status(404).build();
  }
  
  /**
   * get.
   */
  @GetMapping()
  public ResponseEntity<List<Delivery>> get() {
    return ResponseEntity.status(200).body(service.get());
  }
  
  /**
   * delete.
   */
  @DeleteMapping("/{id}")
  public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
    if (service.delete(id)) {
      return ResponseEntity.status(200).build();
    }
    return ResponseEntity.status(404).build();
  }
  
  /**
   * addVideo.
   */
  @PostMapping("/add/video/{id}")
  public ResponseEntity<?> addVideo(@Valid @RequestBody VideoDto video, 
      @PathVariable("id") Integer id) {
    if (service.addVideo(video.getVideo(), id)) {
      return ResponseEntity.status(200).build();
    }   
    return ResponseEntity.status(404).build();
  }
  
  @GetMapping("/videos")
  public ResponseEntity<List<VideoDto>> getVideos() {
    return ResponseEntity.status(200).body(service.getVideos());
  }
  
  @GetMapping("/download/video/{id}")
  public ResponseEntity<VideoDto> downloadVideo(@PathVariable("id") Integer id) {
    return ResponseEntity.status(200).body(service.downloadVideo(id));
  }
}