package com.dharbor.set.persistence.chat.rest;


import com.dharbor.set.persistence.chat.services.ConversationService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;

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


    @RequestMapping(
            value = "/{conversationId}",
            method = RequestMethod.GET
    )
    public void findConversation(@PathVariable("conversationId") String conversationId) {
       // Conversation conversation = conversationService.findById(conversationId);


    }


}
