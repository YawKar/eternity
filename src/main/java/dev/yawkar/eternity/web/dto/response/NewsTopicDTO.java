package dev.yawkar.eternity.web.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class NewsTopicDTO {

    private long id;
    private String title;
    private String description;
    private LocalDateTime timestamp;
}
