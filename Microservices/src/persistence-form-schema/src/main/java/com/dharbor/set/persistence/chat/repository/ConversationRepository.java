package com.dharbor.set.persistence.chat.repository;

import com.dharbor.set.persistence.chat.model.Conversation;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author ivan.alban
 */
public interface ConversationRepository extends MongoRepository<Conversation, String> {

    Conversation findByResourceId(String resourceId);
}
