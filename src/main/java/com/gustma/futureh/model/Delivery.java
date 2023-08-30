package com.gustma.futureh.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

/**
 * class Delivery.
 */
@Entity
public class Delivery {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  private String video;
  
  @Column(name = "delivery_date")
  private LocalDateTime deliveryDate;
  
  @ManyToOne
  @JoinColumn(name = "drone_id")
  @JsonIgnoreProperties("deliveries") 
  // /\ funciona como o exclude do sequelize, ele retira aquele campo da resposta do banco de dados.
  private Drone drone;
  
  private String deliveryCep;
  
  private Integer deliveryNumber;
  
  public Delivery() {}

  /**
   * constructor Delivery.
   */
  public Delivery(String video, Drone drone, String deliveryCep, Integer deliveryNumber) {
    this.drone = drone;
    this.video = video;
    this.deliveryCep = deliveryCep;
    this.deliveryNumber = deliveryNumber;
   
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }

  public LocalDateTime getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(LocalDateTime deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public Drone getDrone() {
    return drone;
  }

  public void setDrone(Drone drone) {
    this.drone = drone;
  }
  
  public String getDeliveryCep() {
    return deliveryCep;
  }

  public void setDeliveryCep(String deliveryCep) {
    this.deliveryCep = deliveryCep;
  }

  public Integer getDeliveryNumber() {
    return deliveryNumber;
  }

  public void setDeliveryNumber(Integer deliveryNumber) {
    this.deliveryNumber = deliveryNumber;
  }

  @PrePersist
  protected void onCreate() {
    deliveryDate = LocalDateTime.now();
  }
}
