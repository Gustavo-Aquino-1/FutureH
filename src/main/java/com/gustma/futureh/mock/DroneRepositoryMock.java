package com.gustma.futureh.mock;

import com.gustma.futureh.model.Drone;
import com.gustma.futureh.repository.DroneRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

/**
 * class DroneRepositoryMock.
 */
public class DroneRepositoryMock implements DroneRepository {

  @Override
  public Page<Drone> findAll(Pageable pageable) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Drone> S save(S entity) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Optional<Drone> findById(Integer id) {
    // TODO Auto-generated method stub
    if (id > 1) {
      Drone drone = new Drone();
      drone.setId(2);
      drone.setModel("YYT-K26");
      return Optional.of(drone);
    }
    return Optional.empty();
  }

  @Override
  public boolean existsById(Integer id) {
    // TODO Auto-generated method stub
    if (id > 1)  {
      return true;      
    }
    return false;
  }

  @Override
  public long count() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void deleteById(Integer id) {
    // TODO Auto-generated method stub
    
    
  }

  @Override
  public void delete(Drone entity) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void deleteAllById(Iterable<? extends Integer> ids) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void deleteAll(Iterable<? extends Drone> entities) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void deleteAll() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public <S extends Drone> Optional<S> findOne(Example<S> example) {
    // TODO Auto-generated method stub
    return Optional.empty();
  }

  @Override
  public <S extends Drone> Page<S> findAll(Example<S> example, Pageable pageable) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Drone> long count(Example<S> example) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public <S extends Drone> boolean exists(Example<S> example) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public <S extends Drone, R> R findBy(Example<S> example,
      Function<FetchableFluentQuery<S>, R> queryFunction) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Drone> findAll() {
    // TODO Auto-generated method stub
    return new ArrayList<Drone>();
  }

  @Override
  public List<Drone> findAll(Sort sort) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Drone> findAllById(Iterable<Integer> ids) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Drone> List<S> saveAll(Iterable<S> entities) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void flush() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public <S extends Drone> S saveAndFlush(S entity) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Drone> List<S> saveAllAndFlush(Iterable<S> entities) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void deleteAllInBatch(Iterable<Drone> entities) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void deleteAllByIdInBatch(Iterable<Integer> ids) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void deleteAllInBatch() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Drone getOne(Integer id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Drone getById(Integer id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Drone getReferenceById(Integer id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Drone> List<S> findAll(Example<S> example) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Drone> List<S> findAll(Example<S> example, Sort sort) {
    // TODO Auto-generated method stub
    return null;
  }

}
