package com.dharbor.set.persistence.chat.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author ivan.alban
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = ContentNotFoundException.CODE)
public class ContentNotFoundException extends RuntimeException {
    public static final String CODE = "CONTENT_NOT_FOUND";
}
