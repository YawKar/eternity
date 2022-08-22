package dev.yawkar.eternity.persistence.repository;

import dev.yawkar.eternity.persistence.model.ThreadTopic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThreadTopicRepository extends JpaRepository<ThreadTopic, Long> {

}
