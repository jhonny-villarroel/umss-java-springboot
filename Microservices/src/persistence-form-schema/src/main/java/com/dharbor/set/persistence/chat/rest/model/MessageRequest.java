package com.dharbor.set.persistence.chat.rest.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author ivan.alban
 */
public class MessageRequest {

    @ApiModelProperty(required = true)
    private String contentId;

    @ApiModelProperty(required = true)
    private String contentType;

    @ApiModelProperty(required = true)
    private String conversationId;

    @ApiModelProperty(required = true)
    private String participantId;

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }
}
