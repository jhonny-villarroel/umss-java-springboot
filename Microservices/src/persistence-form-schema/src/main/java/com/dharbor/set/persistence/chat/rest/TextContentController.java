package com.dharbor.set.persistence.chat.rest;

import com.dharbor.set.persistence.chat.model.TextContent;
import com.dharbor.set.persistence.chat.rest.model.TextContentRequest;
import com.dharbor.set.persistence.chat.services.TextContentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author ivan.alban
 */
@Api
@RestController
@RequestMapping("/textContent")
public class TextContentController {

    @Autowired
    private TextContentService service;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<TextContent> createContent(@RequestBody TextContentRequest requestBody) {
        TextContent textContent = service.create(requestBody.getValue());

        return ResponseEntity.ok(textContent);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/{contentId}"
    )
    public ResponseEntity<TextContent> findContent(@PathVariable("contentId") String contentId) {
        TextContent textContent = service.findById(contentId);

        return ResponseEntity.ok(textContent);
    }

    @RequestMapping(
            method = RequestMethod.PUT,
            value = "/{contentId}"
    )
    public ResponseEntity<TextContent> updateContent(@PathVariable("contentId") String contentId,
                                                     @RequestBody TextContentRequest requestBody) {
        TextContent textContent = service.update(contentId, requestBody.getValue());

        return ResponseEntity.ok(textContent);
    }
}
