package dev.yawkar.eternity.service;

import dev.yawkar.eternity.persistence.exception.ThreadNotFoundException;
import dev.yawkar.eternity.persistence.model.ThreadTopic;
import dev.yawkar.eternity.persistence.repository.ThreadTopicRepository;
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

    public ThreadTopic getThreadById(long threadId) {
        return repository.findById(threadId)
                .orElseThrow(() -> new ThreadNotFoundException("Thread with threadId=%d not found".formatted(threadId)));
    }
}
