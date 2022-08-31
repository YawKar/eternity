package dev.yawkar.eternity.web.api;

import dev.yawkar.eternity.service.ThreadTopicService;
import dev.yawkar.eternity.web.dto.request.NewThreadDTO;
import dev.yawkar.eternity.web.dto.response.ThreadTopicDTO;
import dev.yawkar.eternity.web.mapper.ThreadTopicMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Tag(name = "Threads controller", description = "Contains endpoints for managing threads")
@RestController
@RequestMapping("/api/v1/threads")
public class ThreadsController {

    private final ThreadTopicService threadService;
    private final ThreadTopicMapper threadMapper;

    public ThreadsController(ThreadTopicService threadService, ThreadTopicMapper threadMapper) {
        this.threadService = threadService;
        this.threadMapper = threadMapper;
    }

    @Operation(summary = "Create thread")
    @ApiResponse(responseCode = "200", description = "Successfully created new thread",
            content = @Content(schema = @Schema(implementation = ThreadTopicDTO.class)))
    @ApiResponse(responseCode = "400", description = "Invalid request body")
    @PostMapping
    public ThreadTopicDTO createNewThread(@Valid @RequestBody NewThreadDTO newThreadDTO) {
        return threadMapper.toDTO(threadService.addNewThreadTopic(threadMapper.toEntity(newThreadDTO)));
    }
}
