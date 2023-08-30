package com.gustma.futureh.dto;

/**
 * class DeliveryDto.
 */
public class DeliveryDto {
  private String video;
  private Integer droneId;
  private String cep;
  private Integer number;
  
  public DeliveryDto() {}

  /**
   * constructor DeliveryDto.
   */
  public DeliveryDto(String video, Integer droneId, String cep, Integer number) {
    super();
    this.video = video;
    this.droneId = droneId;
    this.cep = cep;
    this.number = number;
  }

  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }

  public Integer getDroneId() {
    return droneId;
  }

  public void setDroneId(Integer droneId) {
    this.droneId = droneId;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }  
}
