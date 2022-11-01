package dev.yawkar.eternity.web.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ThreadTopicDTO {

    private long id;
    private String title;
    private String description;
    private long messagesNumber;
}
