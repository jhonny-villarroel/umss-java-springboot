package com.dharbor.set.persistence.chat.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author ivan.alban
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = ConversationNotFoundException.CODE)
public class ConversationNotFoundException extends RuntimeException {
    public static final String CODE = "CONVERSATION_NOT_FOUND";
}
