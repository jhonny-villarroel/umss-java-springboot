package com.dharbor.set.persistence.chat.rest.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author ivan.alban
 */
public class TextContentRequest {

    @ApiModelProperty(required = true)
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
