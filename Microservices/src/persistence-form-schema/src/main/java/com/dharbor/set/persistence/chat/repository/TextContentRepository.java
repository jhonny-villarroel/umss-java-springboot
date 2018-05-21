package com.dharbor.set.persistence.chat.repository;

import com.dharbor.set.persistence.chat.model.TextContent;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author ivan.alban
 */
public interface TextContentRepository extends MongoRepository<TextContent, String> {
}
