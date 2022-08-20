package dev.yawkar.eternity.web.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Getter
@Setter
@Accessors(chain = true)
public class MessageDTO {

    private long id;
    private long threadId;
    private String text;
    private LocalDateTime timestamp;
}
