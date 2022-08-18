package dev.yawkar.eternity.web.mvc;

import dev.yawkar.eternity.service.ThreadTopicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ThreadController {

    private final ThreadTopicService threadService;

    public ThreadController(ThreadTopicService threadService) {
        this.threadService = threadService;
    }

    @GetMapping("/thread/{threadId}")
    String openThread(@PathVariable long threadId, Model model) {

        return "thread";
    }
}
