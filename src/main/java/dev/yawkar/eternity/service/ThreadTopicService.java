package dev.yawkar.eternity.service;

import dev.yawkar.eternity.persistence.exception.ThreadNotFoundException;
import dev.yawkar.eternity.persistence.model.Message;
import dev.yawkar.eternity.persistence.model.ThreadTopic;
import dev.yawkar.eternity.persistence.repository.MessageRepository;
import dev.yawkar.eternity.persistence.repository.ThreadTopicRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThreadTopicService {

    private final ThreadTopicRepository threadRepository;
    private final MessageRepository messageRepository;

    public ThreadTopicService(
            ThreadTopicRepository threadRepository,
            MessageRepository messageRepository) {
        this.threadRepository = threadRepository;
        this.messageRepository = messageRepository;
    }

    public List<ThreadTopic> getAllThreads() {
        return threadRepository.findAll();
    }

    public ThreadTopic getThreadById(long threadId) {
        return threadRepository.findById(threadId).orElseThrow(() -> new ThreadNotFoundException(threadId));
    }

    public List<Message> getAllMessagesByThreadIdSortedByIdAsc(long threadId) {
        return messageRepository.findAllByThreadIdOrderByIdAsc(threadId);
    }

    public void addMessageToThread(Message newMessage) {
        if (!threadRepository.existsById(newMessage.getThreadId())) {
            throw new ThreadNotFoundException(newMessage.getThreadId());
        }
        messageRepository.save(newMessage);
    }
}
