package com.dharbor.set.persistence.chat.rest;

import com.dharbor.set.persistence.chat.model.Conversation;
import com.dharbor.set.persistence.chat.rest.model.ConversationRequest;
import com.dharbor.set.persistence.chat.rest.model.ParticipantRequest;
import com.dharbor.set.persistence.chat.services.ConversationService;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import io.swagger.annotations.Api;
import org.bson.BSONObject;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author ivan.alban
 */
@Api
@RestController
@RequestMapping("/conversation")
public class ConversationController {

    @Autowired
    private ConversationService conversationService;
    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping(method = RequestMethod.POST)
    public  ResponseEntity<?>  createConversation(@RequestBody String  jsonString) {
        DBObject dbObject = (DBObject) com.mongodb.util.JSON.parse(jsonString);

        mongoTemplate.insert(dbObject, "foo");
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @RequestMapping(
            value = "/{conversationId}",
            method = RequestMethod.GET
    )
    public ResponseEntity<Conversation> findConversation(@PathVariable("conversationId") String conversationId) {

        Query query = Query.query(new Criteria("_id", convertToObjectId(id)));
        return mongoTemplate.find(query, O
                collection


        Conversation conversation = conversationService.findById(conversationId);

        return ResponseEntity.ok(conversation);
    }

    Object convertToObjectId(Object id) {
        if (id instanceof String && ObjectId.isValid(id)) {
            return new ObjectId(id);
        }
        return id;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Conversation> findConversationByResourceId(@RequestParam("resourceId") String resourceId) {
        Conversation conversation = conversationService.findByResourceId(resourceId);

        return ResponseEntity.ok(conversation);
    }

    @RequestMapping(
            value = "/{conversationId}/participant",
            method = RequestMethod.POST
    )
    public ResponseEntity<Conversation> addParticipant(@PathVariable("conversationId") String conversationId,
                                                       @RequestBody ParticipantRequest requestBody) {
        Conversation conversation = conversationService.addParticipant(conversationId, requestBody.getUserId());

        return ResponseEntity.ok(conversation);
    }
}
