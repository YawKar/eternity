package dev.yawkar.eternity.persistence.repository;

import dev.yawkar.eternity.persistence.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {

    List<Message> findAllByThreadIdOrderByIdAsc(long threadId);
}
