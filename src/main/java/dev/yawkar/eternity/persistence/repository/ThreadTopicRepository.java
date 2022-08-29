package dev.yawkar.eternity.persistence.repository;

import dev.yawkar.eternity.persistence.model.ThreadTopic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ThreadTopicRepository extends JpaRepository<ThreadTopic, Long> {

    @Query(nativeQuery = true, value = "" +
            "SELECT t.* " +
            "FROM thread_topics t " +
            "GROUP BY t.id " +
            "ORDER BY (SELECT count(*) FROM messages m WHERE m.thread_id = t.id AND m.timestamp BETWEEN now() - INTERVAL '7 DAYS' AND now()) DESC " +
            "LIMIT 10")
    List<ThreadTopic> findTop10ThreadByMessagesLastWeek();

}
