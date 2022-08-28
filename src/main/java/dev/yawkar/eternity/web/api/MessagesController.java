package dev.yawkar.eternity.web.api;

import dev.yawkar.eternity.service.ThreadTopicService;
import dev.yawkar.eternity.web.dto.request.NewMessageDTO;
import dev.yawkar.eternity.web.mapper.MessageMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Tag(name = "Messages controller", description = "Contains endpoints for managing messages")
@RestController
@RequestMapping("/api/v1/messages")
public class MessagesController {

    private final ThreadTopicService threadService;
    private final MessageMapper messageMapper;


    public MessagesController(
            ThreadTopicService threadService,
            MessageMapper messageMapper) {
        this.threadService = threadService;
        this.messageMapper = messageMapper;
    }

    @Operation(summary = "Post new message to the thread by threadId")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Posted the message"),
            @ApiResponse(responseCode = "404", description = "Thread not found")})
    @PostMapping
    void postNewMessage(@RequestBody @Valid NewMessageDTO newMessage) {
        threadService.addMessageToThread(messageMapper.toEntity(newMessage));
    }
}
