package com.gustma.futureh.dto;

import javax.validation.constraints.NotBlank;

/**
 * class VideoDto.
 */
public class VideoDto {
  @NotBlank
  public String video;
  
  public VideoDto() {}
  
  public VideoDto(String video) {
    this.video = video;
  }

  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }
}

