package com.gustma.futureh.repository;

import com.gustma.futureh.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * interface DeliveryRepository.
 */
@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Integer>  {
}
