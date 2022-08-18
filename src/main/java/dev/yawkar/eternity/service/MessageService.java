package dev.yawkar.eternity.service;

import dev.yawkar.eternity.persistence.model.Message;
import dev.yawkar.eternity.persistence.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    private final MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public List<Message> getAllMessagesByThreadId(long threadId) {
        return repository.findAllByThreadId(threadId);
    }
}
