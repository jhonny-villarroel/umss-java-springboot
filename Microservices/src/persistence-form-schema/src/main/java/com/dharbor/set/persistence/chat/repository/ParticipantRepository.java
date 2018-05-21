package com.dharbor.set.persistence.chat.repository;

import com.dharbor.set.persistence.chat.model.Participant;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author ivan.alban
 */
public interface ParticipantRepository extends MongoRepository<Participant, String> {
}
