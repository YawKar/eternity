package dev.yawkar.eternity.web.mapper;

import dev.yawkar.eternity.persistence.model.ThreadTopic;
import dev.yawkar.eternity.web.dto.request.NewThreadDTO;
import dev.yawkar.eternity.web.dto.response.ThreadTopicDTO;
import org.springframework.stereotype.Component;

@Component
public class ThreadTopicMapper {

    public ThreadTopic toEntity(NewThreadDTO newThreadDTO) {
        return new ThreadTopic()
                .setTitle(newThreadDTO.getTitle())
                .setDescription(newThreadDTO.getDescription());
    }

    public ThreadTopicDTO toDTO(ThreadTopic threadTopic) {
        return new ThreadTopicDTO()
                .setId(threadTopic.getId())
                .setTitle(threadTopic.getTitle())
                .setDescription(threadTopic.getDescription());
    }
}
