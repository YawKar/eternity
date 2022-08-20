package dev.yawkar.eternity.web.mvc;

import dev.yawkar.eternity.service.MessageService;
import dev.yawkar.eternity.service.ThreadTopicService;
import dev.yawkar.eternity.web.dto.response.MessageDTO;
import dev.yawkar.eternity.web.dto.response.ThreadTopicDTO;
import dev.yawkar.eternity.web.mapper.MessageMapper;
import dev.yawkar.eternity.web.mapper.ThreadTopicMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ThreadController {

    private final ThreadTopicService threadService;
    private final MessageService messageService;
    private final ThreadTopicMapper threadMapper;
    private final MessageMapper messageMapper;

    public ThreadController(
            ThreadTopicService threadService,
            MessageService messageService,
            ThreadTopicMapper threadMapper,
            MessageMapper messageMapper) {
        this.threadService = threadService;
        this.messageService = messageService;
        this.threadMapper = threadMapper;
        this.messageMapper = messageMapper;
    }

    @GetMapping("/thread/{threadId}")
    String openThread(@PathVariable long threadId, Model model) {
        ThreadTopicDTO threadTopic = threadMapper.toDTO(threadService.getThreadById(threadId));
        model.addAttribute("thread", threadTopic);
        List<MessageDTO> messages = messageService.getAllMessagesByThreadIdSortedByIdAsc(threadId).stream().map(messageMapper::toDTO).toList();
        model.addAttribute("messages", messages);
        return "thread_chat";
    }

    @GetMapping("/thread/{threadId}/info")
    String openThreadInfo(@PathVariable long threadId, Model model) {
        ThreadTopicDTO threadTopic = threadMapper.toDTO(threadService.getThreadById(threadId));
        model.addAttribute("thread", threadTopic);
        return "thread_info";
    }
}
