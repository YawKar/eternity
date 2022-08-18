package dev.yawkar.eternity.web.mapper;

import dev.yawkar.eternity.persistence.model.NewsTopic;
import dev.yawkar.eternity.web.dto.NewsTopicDTO;
import org.springframework.stereotype.Component;

@Component
public class NewsTopicMapper {

    public NewsTopicDTO toDTO(NewsTopic newsTopic) {
        return new NewsTopicDTO()
                .setId(newsTopic.getId())
                .setTitle(newsTopic.getTitle())
                .setDescription(newsTopic.getDescription())
                .setTimestamp(newsTopic.getTimestamp());
    }
}
