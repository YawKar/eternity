package dev.yawkar.eternity.web.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Getter
@Setter
@Accessors(chain = true)
public class NewsTopicDTO {

    private long id;
    private String title;
    private String description;
    private LocalDateTime timestamp;
}
