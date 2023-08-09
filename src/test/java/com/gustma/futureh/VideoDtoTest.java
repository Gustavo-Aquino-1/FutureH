package com.gustma.futureh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.gustma.futureh.dto.VideoDto;
import org.junit.jupiter.api.Test;


/**
 * class VideoDtoTest.
 */
public class VideoDtoTest {
  
  @Test
  public void testVideoDto() {
    VideoDto videoDto = new VideoDto("src/videos/video.mp4");
    assertEquals(videoDto.getVideo(), "src/videos/video.mp4");
  }
  
  @Test
  public void testSetVideo() {
    VideoDto videoDto = new VideoDto();
    videoDto.setVideo("src/videos/video.mp4");
    assertEquals(videoDto.getVideo(), "src/videos/video.mp4");
  }
}
