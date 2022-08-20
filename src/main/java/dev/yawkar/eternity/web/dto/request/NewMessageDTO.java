package dev.yawkar.eternity.web.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@Accessors(chain = true)
public class NewMessageDTO {

    @Size(min = 1, max = 800)
    @NotBlank
    @JsonProperty(required = true)
    private String text;
    @JsonProperty(value = "thread_id", required = true)
    private long threadId;
}
