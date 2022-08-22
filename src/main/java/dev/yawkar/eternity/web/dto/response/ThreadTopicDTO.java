package dev.yawkar.eternity.web.dto.response;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class ThreadTopicDTO {

    private long id;
    private String title;
    private String description;
    private long messagesNumber;
}
