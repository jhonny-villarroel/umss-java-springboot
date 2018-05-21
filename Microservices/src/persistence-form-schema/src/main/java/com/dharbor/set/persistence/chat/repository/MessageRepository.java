package com.dharbor.set.persistence.chat.repository;

import com.dharbor.set.persistence.chat.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author ivan.alban
 */
public interface MessageRepository extends MongoRepository<Message, String> {


    List<Message> findByConversationIdOrderByCreatedDateDesc(String conversationId);
}
