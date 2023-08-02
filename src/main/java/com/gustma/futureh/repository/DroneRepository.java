package com.gustma.futureh.repository;

import com.gustma.futureh.model.Drone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * interface DroneRepository.
 */
@Repository
public interface DroneRepository extends JpaRepository<Drone, Integer>  {
}
