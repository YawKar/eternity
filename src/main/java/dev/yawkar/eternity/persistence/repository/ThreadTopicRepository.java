package dev.yawkar.eternity.persistence.repository;

import dev.yawkar.eternity.persistence.model.ThreadTopic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ThreadTopicRepository extends JpaRepository<ThreadTopic, Long> {

    List<ThreadTopic> findTop10ByOrderByMessagesNumberDesc();
}
