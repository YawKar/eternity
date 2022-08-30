package dev.yawkar.eternity.web.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Accessors(chain = true)
public class NewThreadDTO {

    @JsonProperty(required = true)
    @NotBlank
    private String title;
    @JsonProperty(required = true)
    private String description;
}
