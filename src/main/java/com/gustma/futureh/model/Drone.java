package com.gustma.futureh.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * class Drone.
 */
@Entity
public class Drone {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  private String model;
  
  @OneToMany(mappedBy = "drone", cascade = CascadeType.ALL, orphanRemoval = true)
  @JsonIgnoreProperties("drone")
  private List<Delivery> deliveries = new ArrayList<Delivery>();
  // o @JsonIgnoreProperties serve para nao gerar um ciclo infinito, porque se nao
  // o drone vai renderizar a lista e na lista de deliveries cada elemento tem um drone, que
  //  vai ser serializado e esse drone também terá uma lista de deliveries que ele serializa,
  // gerando assim um ciclo infinito.
  
  //  A anotação @JsonIgnoreProperties("drone") informa ao Jackson para ignorar a 
  //  propriedade drone durante a serialização da classe Delivery, evitando assim 
  //  a recursão infinita.
    

  public Drone() {}
  
  public Drone(Integer id, String model) {
    this.model = model;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public List<Delivery> getDeliveries() {
    return deliveries;
  }
  
  public void addDevilery(Delivery delivery) {
    this.deliveries.add(delivery);
  }
  
  public void removeDelivery(Integer deliveryId) {
    this.deliveries = this.deliveries.stream().filter(e -> e.getId() != deliveryId)
        .collect(Collectors.toList());
  }
}
