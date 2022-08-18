package dev.yawkar.eternity.web.mvc;

import dev.yawkar.eternity.service.NewsService;
import dev.yawkar.eternity.web.dto.NewsTopicDTO;
import dev.yawkar.eternity.web.mapper.NewsTopicMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final NewsService newsService;
    private final NewsTopicMapper newsMapper;

    public HomeController(NewsService newsService, NewsTopicMapper newsMapper) {
        this.newsService = newsService;
        this.newsMapper = newsMapper;
    }

    @GetMapping
    String homepage(Model model) {
        List<NewsTopicDTO> newsTopics = newsService.getAllNewsSortedByTime().stream().map(newsMapper::toDTO).toList();
        model.addAttribute("newsTopics", newsTopics);
        return "homepage";
    }
}
