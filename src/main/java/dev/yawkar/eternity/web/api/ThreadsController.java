package dev.yawkar.eternity.web.api;

import dev.yawkar.eternity.service.ThreadTopicService;
import dev.yawkar.eternity.web.dto.request.NewThreadDTO;
import dev.yawkar.eternity.web.dto.response.ThreadTopicDTO;
import dev.yawkar.eternity.web.mapper.ThreadTopicMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/threads")
public class ThreadsController {

    private final ThreadTopicService threadService;
    private final ThreadTopicMapper threadMapper;

    public ThreadsController(ThreadTopicService threadService, ThreadTopicMapper threadMapper) {
        this.threadService = threadService;
        this.threadMapper = threadMapper;
    }

    @PostMapping
    public ThreadTopicDTO createNewThread(@Valid @RequestBody NewThreadDTO newThreadDTO) {
        return threadMapper.toDTO(threadService.addNewThreadTopic(threadMapper.toEntity(newThreadDTO)));
    }
}
