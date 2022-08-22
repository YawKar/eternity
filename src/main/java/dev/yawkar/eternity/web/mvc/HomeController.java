package dev.yawkar.eternity.web.mvc;

import dev.yawkar.eternity.service.NewsTopicService;
import dev.yawkar.eternity.service.ThreadTopicService;
import dev.yawkar.eternity.web.dto.response.NewsTopicDTO;
import dev.yawkar.eternity.web.dto.response.ThreadTopicDTO;
import dev.yawkar.eternity.web.mapper.NewsTopicMapper;
import dev.yawkar.eternity.web.mapper.ThreadTopicMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final NewsTopicService newsTopicService;
    private final ThreadTopicService threadTopicService;
    private final NewsTopicMapper newsMapper;
    private final ThreadTopicMapper threadMapper;

    public HomeController(
            NewsTopicService newsTopicService,
            ThreadTopicService threadTopicService,
            NewsTopicMapper newsMapper,
            ThreadTopicMapper threadMapper) {
        this.newsTopicService = newsTopicService;
        this.threadTopicService = threadTopicService;
        this.newsMapper = newsMapper;
        this.threadMapper = threadMapper;
    }

    @GetMapping
    String homePage(Model model) {
        List<NewsTopicDTO> newsTopics = newsTopicService.getAllNewsSortedByTime().stream().map(newsMapper::toDTO).toList();
        model.addAttribute("newsTopics", newsTopics);
        List<ThreadTopicDTO> threadTopics = threadTopicService.get10TopicsSortedByMessagesNumber().stream().map(threadMapper::toDTO).toList();
        model.addAttribute("popularThreads", threadTopics);
        return "homepage";
    }

    @GetMapping("/readme")
    String readmePage() {
        return "readme";
    }
}
