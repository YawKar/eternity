package dev.yawkar.eternity.web.mapper;

import dev.yawkar.eternity.persistence.model.Message;
import dev.yawkar.eternity.web.dto.request.NewMessageDTO;
import dev.yawkar.eternity.web.dto.response.MessageDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MessageMapper {

    public MessageDTO toDTO(Message message) {
        return new MessageDTO()
                .setId(message.getId())
                .setThreadId(message.getThreadId())
                .setText(message.getText())
                .setTimestamp(message.getTimestamp());
    }

    public Message toEntity(NewMessageDTO newMessage) {
        return new Message()
                .setText(newMessage.getText())
                .setTimestamp(LocalDateTime.now())
                .setThreadId(newMessage.getThreadId());
    }
}
