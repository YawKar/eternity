package dev.yawkar.eternity.web.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;

@Schema(description = "New thread model")
@Getter
@Setter
@Accessors(chain = true)
public class NewThreadDTO {

    @Schema(description = "Thread's title", example = "/Java/Spring/etc")
    @JsonProperty(required = true)
    @NotBlank
    private String title;

    @Schema(description = "Thread's description", example = "discussions about java, spring and other tech words")
    @JsonProperty(required = true)
    private String description;
}
