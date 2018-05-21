package com.dharbor.set.persistence.chat.rest.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author ivan.alban
 */
public class ParticipantRequest {

    @ApiModelProperty(required = true)
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
