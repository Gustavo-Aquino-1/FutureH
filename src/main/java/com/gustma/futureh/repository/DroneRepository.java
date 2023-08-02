package com.gustma.futureh.repository;

import com.gustma.futureh.model.Drone;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * interface DroneRepository.
 */
public interface DroneRepository extends JpaRepository<Drone, Integer>  {
}
