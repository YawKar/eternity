package dev.yawkar.eternity.web.dto.response;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class MessageDTO {

    private long id;
    private long threadId;
    private String text;
    private LocalDateTime timestamp;
}
