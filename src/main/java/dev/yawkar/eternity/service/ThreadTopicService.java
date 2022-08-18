package dev.yawkar.eternity.service;

import dev.yawkar.eternity.persistence.model.ThreadTopic;
import dev.yawkar.eternity.persistence.repository.ThreadTopicRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThreadTopicService {

    private final ThreadTopicRepository repository;

    public ThreadTopicService(ThreadTopicRepository repository) {
        this.repository = repository;
    }

    public List<ThreadTopic> get10TopicsSortedByMessagesNumber() {
        return repository.findTop10ByOrderByMessagesNumberDesc();
    }
}
