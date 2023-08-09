package com.gustma.futureh.service;

import com.gustma.futureh.dto.DeliveryDto;
import com.gustma.futureh.dto.DroneDto;
import com.gustma.futureh.dto.VideoDto;
import com.gustma.futureh.model.Delivery;
import com.gustma.futureh.model.Drone;
import com.gustma.futureh.repository.DeliveryRepository;
import com.gustma.futureh.repository.DroneRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * class DroneService.
 */
@Service
public class DeliveryService {
  @Autowired
  private DeliveryRepository repo;
  
  @Autowired
  private DroneRepository repoDrone;
  
  /**
   * create.
   */
  public boolean create(DeliveryDto delivery) {
    Optional<Drone> drone = repoDrone.findById(delivery.getDroneId());
    if (drone.isEmpty()) {
      return false;
    }
    Delivery newDelivery = new Delivery();
    newDelivery.setVideo(delivery.getVideo());
    Drone findDrone = drone.get();
    newDelivery.setDrone(findDrone);
    findDrone.addDevilery(newDelivery);
    repoDrone.save(findDrone);
    return true;
  }
  
  
  /**
   * update. 
   */
  public boolean update(Integer id, DeliveryDto delivery) { // sabe muito.
    if (!repo.existsById(id)) {
      return false;
    }
    Delivery attDelivery = repo.findById(id).get();
    attDelivery.setVideo(delivery.getVideo());
    if (delivery.getDroneId() != attDelivery.getDrone().getId()) {
      if (repoDrone.existsById(delivery.getDroneId())) {
        Drone newDrone = repoDrone.findById(delivery.getDroneId()).get();
        attDelivery.setDrone(newDrone); 
        repo.save(attDelivery);
        return true;
      }
      return false;
    }
    repo.save(attDelivery);
    return true;
  }
  
  /**
   * get.
   */
  public List<Delivery> get() {
    return repo.findAll();
  }
  
  /**
   * delete.
   */
  public boolean delete(Integer id) {
    if (repo.existsById(id)) {
      repo.deleteById(id);
      return true;
    }
    return false;
  }
  
  /**
   * addVideo.
   */
  public boolean addVideo(String video, Integer id) {
    if (repo.existsById(id)) {
      Delivery delivery = repo.findById(id).get();
      delivery.setVideo(video);
      repo.save(delivery);
      return true;
    }
    return false;
  }
  
  /**
   * getVideos.
   */
  public List<VideoDto> getVideos() {
    List<Delivery> deliveries = repo.findAll();
    List<VideoDto> videos = new ArrayList<VideoDto>();
    for (Delivery d : deliveries) {
      if (d.getVideo() != null) {
        videos.add(new VideoDto(d.getVideo()));
      }
    }
    return videos;
  }
  
  /**
   * downloadVideo.
   */
  public VideoDto downloadVideo(Integer id) {
    if (repo.existsById(id)) {
      return new VideoDto(repo.findById(id).get().getVideo());
    }
    return new VideoDto();
  }
}
