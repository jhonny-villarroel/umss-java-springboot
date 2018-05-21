package com.dharbor.set.persistence.chat.services;

import com.dharbor.set.persistence.chat.exception.ContentNotFoundException;
import com.dharbor.set.persistence.chat.model.TextContent;
import com.dharbor.set.persistence.chat.repository.TextContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author ivan.alban
 */
@Service
public class TextContentService {

    @Autowired
    private TextContentRepository repository;

    public TextContent create(String value) {
        TextContent instance = new TextContent();
        instance.setValue(value);

        return repository.save(instance);
    }

    public TextContent findById(String contentId) {
        TextContent textContent = repository.findOne(contentId);

        if (null == textContent) {
            throw new ContentNotFoundException();
        }

        return textContent;
    }

    public TextContent update(String contentId, String value) {
        TextContent instance = findById(contentId);
        instance.setValue(value);
        instance.setUpdatedDate(new Date());

        return repository.save(instance);
    }
}
