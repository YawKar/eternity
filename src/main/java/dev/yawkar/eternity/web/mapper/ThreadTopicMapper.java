package dev.yawkar.eternity.web.mapper;

import dev.yawkar.eternity.persistence.model.ThreadTopic;
import dev.yawkar.eternity.web.dto.response.ThreadTopicDTO;
import org.springframework.stereotype.Component;

@Component
public class ThreadTopicMapper {

    public ThreadTopicDTO toDTO(ThreadTopic threadTopic) {
        return new ThreadTopicDTO()
                .setId(threadTopic.getId())
                .setTitle(threadTopic.getTitle())
                .setDescription(threadTopic.getDescription())
                .setMessagesNumber(threadTopic.getMessagesNumber());
    }
}
