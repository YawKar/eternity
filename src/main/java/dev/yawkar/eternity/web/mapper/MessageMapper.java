package dev.yawkar.eternity.web.mapper;

import dev.yawkar.eternity.persistence.model.Message;
import dev.yawkar.eternity.web.dto.response.MessageDTO;
import org.springframework.stereotype.Component;

@Component
public class MessageMapper {

    public MessageDTO toDTO(Message message) {
        return new MessageDTO()
                .setId(message.getId())
                .setThreadId(message.getThreadId())
                .setText(message.getText())
                .setTimestamp(message.getTimestamp());
    }
}
