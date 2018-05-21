package com.dharbor.set.persistence.chat.services;

import com.dharbor.set.persistence.chat.exception.MessageNotFoundException;
import com.dharbor.set.persistence.chat.model.Message;
import com.dharbor.set.persistence.chat.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author ivan.alban
 */
@Service
public class MessageService {

    @Autowired
    private MessageRepository repository;

    public Message create(String contentType, String conversationId, String participantId, String contentId) {
        Message instance = new Message();
        instance.setContentId(contentId);
        instance.setContentType(contentType);
        instance.setConversationId(conversationId);
        instance.setParticipantId(participantId);

        instance.setDeleted(Boolean.FALSE);
        instance.setCreatedDate(new Date());

        return repository.save(instance);
    }

    public Message findById(String messageId) {
        Message instance = repository.findOne(messageId);

        if (null == instance) {
            throw new MessageNotFoundException();
        }

        return instance;
    }

    public Message delete(String messageId) {
        Message instance = findById(messageId);

        instance.setDeleted(Boolean.TRUE);
        return repository.save(instance);
    }

    public List<Message> findMessages(String conversationId) {
        return repository.findByConversationIdOrderByCreatedDateDesc(conversationId);
    }
}
