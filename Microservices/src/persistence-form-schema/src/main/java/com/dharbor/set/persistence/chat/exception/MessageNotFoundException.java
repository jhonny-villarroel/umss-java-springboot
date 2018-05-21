package com.dharbor.set.persistence.chat.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author ivan.alban
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = MessageNotFoundException.CODE)
public class MessageNotFoundException extends RuntimeException {
    public static final String CODE = "MESSAGE_NOT_FOUND";
}
