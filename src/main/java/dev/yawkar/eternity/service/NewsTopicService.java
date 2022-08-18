package dev.yawkar.eternity.service;

import dev.yawkar.eternity.persistence.model.NewsTopic;
import dev.yawkar.eternity.persistence.repository.NewsTopicRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsTopicService {

    private final NewsTopicRepository repository;

    public NewsTopicService(NewsTopicRepository repository) {
        this.repository = repository;
    }

    public List<NewsTopic> getAllNewsSortedByTime() {
        return repository.findAll(Sort.by(Sort.Order.desc("timestamp")));
    }
}
