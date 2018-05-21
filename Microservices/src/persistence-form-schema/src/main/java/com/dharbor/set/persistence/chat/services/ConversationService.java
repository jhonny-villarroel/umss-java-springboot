package com.dharbor.set.persistence.chat.services;

import com.dharbor.set.persistence.chat.exception.ConversationNotFoundException;
import com.dharbor.set.persistence.chat.model.Conversation;
import com.dharbor.set.persistence.chat.model.Participant;
import com.dharbor.set.persistence.chat.repository.ConversationRepository;
import com.dharbor.set.persistence.chat.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ivan.alban
 */
@Service
public class ConversationService {

    @Autowired
    private ConversationRepository repository;

    @Autowired
    private ParticipantRepository participantRepository;

    public Conversation create(String resourceId) {
        Conversation instance = new Conversation();
        instance.setResourceId(resourceId);
        instance.setParticipants(new ArrayList<>());

        return repository.save(instance);
    }

    public Conversation findById(String conversationId) {
        Conversation instance = repository.findOne(conversationId);

        if (null == instance) {
            throw new ConversationNotFoundException();
        }

        return instance;
    }

    public Conversation findByResourceId(String resourceId) {
        Conversation instance = repository.findByResourceId(resourceId);

        if (null == instance) {
            throw new ConversationNotFoundException();
        }

        return instance;
    }

    public Conversation addParticipant(String conversationId, String userId) {
        Conversation conversation = repository.findOne(conversationId);

        if (null == conversation) {
            throw new ConversationNotFoundException();
        }

        List<String> participantUserIds = conversation.getParticipants()
                .stream()
                .map(Participant::getUserId)
                .collect(Collectors.toList());

        if (participantUserIds.contains(userId)) {
            return conversation;
        }

        Participant participant = new Participant();
        participant.setUserId(userId);

        participant = participantRepository.save(participant);

        List<Participant> participants = conversation.getParticipants();
        participants.add(participant);

        conversation.setParticipants(participants);

        return repository.save(conversation);
    }
}
