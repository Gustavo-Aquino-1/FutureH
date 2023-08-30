package com.gustma.futureh.mock;

import com.gustma.futureh.model.Delivery;
import com.gustma.futureh.model.Drone;
import com.gustma.futureh.repository.DeliveryRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

/**
 * class DeliveryServiceMock.
 */
public class DeliveryRepositoryMock implements DeliveryRepository {

  @Override
  public List<Delivery> findAll() {
    // TODO Auto-generated method stub
    return new ArrayList<Delivery>();
  }

  @Override
  public List<Delivery> findAll(Sort sort) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Delivery> findAllById(Iterable<Integer> ids) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Delivery> List<S> saveAll(Iterable<S> entities) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void flush() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public <S extends Delivery> S saveAndFlush(S entity) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Delivery> List<S> saveAllAndFlush(Iterable<S> entities) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void deleteAllInBatch(Iterable<Delivery> entities) {
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
  public Delivery getOne(Integer id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Delivery getById(Integer id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Delivery getReferenceById(Integer id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Delivery> List<S> findAll(Example<S> example) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Delivery> List<S> findAll(Example<S> example, Sort sort) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Page<Delivery> findAll(Pageable pageable) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Delivery> S save(S entity) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Optional<Delivery> findById(Integer id) {
    // TODO Auto-generated method stub
    if (id > 1) {
      Drone drone = new Drone();
      drone.setId(5);
      Delivery delivery = new Delivery("/src/main/video.mp4", drone);
      delivery.setId(5);
      return Optional.of(delivery);
    }
    return Optional.empty();
  }

  @Override
  public boolean existsById(Integer id) {
    // TODO Auto-generated method stub
    if (id > 1) {
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
  public void delete(Delivery entity) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void deleteAllById(Iterable<? extends Integer> ids) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void deleteAll(Iterable<? extends Delivery> entities) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void deleteAll() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public <S extends Delivery> Optional<S> findOne(Example<S> example) {
    // TODO Auto-generated method stub
    return Optional.empty();
  }

  @Override
  public <S extends Delivery> Page<S> findAll(Example<S> example, Pageable pageable) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public <S extends Delivery> long count(Example<S> example) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public <S extends Delivery> boolean exists(Example<S> example) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public <S extends Delivery, R> R findBy(Example<S> example,
      Function<FetchableFluentQuery<S>, R> queryFunction) {
    // TODO Auto-generated method stub
    return null;
  }

}
