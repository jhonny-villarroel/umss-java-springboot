package com.dharbor.set.persistence.chat.data.api;


import com.dharbor.set.persistence.chat.data.domain.ConversationEntity;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author jhonny.villarroel
 */
@FeignClient(name = "persistence-form-schema")
public interface ConversationClient {


    @RequestMapping(
            method = RequestMethod.GET,
            value = "/conversation"
    )
    ConversationEntity findConversationByResourceId(@RequestParam("resourceId") String resourceId);

}
