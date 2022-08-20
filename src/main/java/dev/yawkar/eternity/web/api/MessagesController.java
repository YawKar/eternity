package dev.yawkar.eternity.web.api;

import dev.yawkar.eternity.service.ThreadTopicService;
import dev.yawkar.eternity.web.dto.request.NewMessageDTO;
import dev.yawkar.eternity.web.mapper.MessageMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

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

    @PostMapping
    void postNewMessage(@RequestBody @Valid NewMessageDTO newMessage) {
        threadService.addMessageToThread(messageMapper.toEntity(newMessage));
    }
}
