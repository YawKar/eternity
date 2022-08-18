package dev.yawkar.eternity.persistence.repository;

import dev.yawkar.eternity.persistence.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
