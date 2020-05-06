package com.example.lobby.dto;

import com.example.lobby.domain.Views;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;


@Data
@JsonView(Views.Id.class)
public class WsEventDto {
    private ObjectType objectType;
    private EventType eventType;

    @JsonRawValue
    private String body;

    public ObjectType getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public WsEventDto(ObjectType objectType, EventType eventType, String body) {
        this.objectType = objectType;
        this.eventType = eventType;
        this.body = body;
    }
}
