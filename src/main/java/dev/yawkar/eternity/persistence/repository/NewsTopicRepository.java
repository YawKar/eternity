package dev.yawkar.eternity.persistence.repository;

import dev.yawkar.eternity.persistence.model.NewsTopic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsTopicRepository extends JpaRepository<NewsTopic, Long> {
}
