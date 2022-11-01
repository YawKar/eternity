package dev.yawkar.eternity.web.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Schema(description = "New message model")
@Data
@Accessors(chain = true)
public class NewMessageDTO {

    @Schema(description = "Text content of the message", example = "Hello world!")
    @Size(min = 1, max = 800)
    @NotBlank
    @JsonProperty(required = true)
    private String text;

    @Schema(description = "Id of the thread where the message should be posted", example = "1337420")
    @JsonProperty(value = "thread_id", required = true)
    private long threadId;
}
