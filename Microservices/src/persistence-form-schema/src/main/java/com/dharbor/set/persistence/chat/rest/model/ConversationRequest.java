package com.dharbor.set.persistence.chat.rest.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author ivan.alban
 */
public class ConversationRequest {

    @ApiModelProperty(required = true)
    private String resourceId;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}
