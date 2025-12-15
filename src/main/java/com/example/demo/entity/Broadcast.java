package com.example.demo.entity;

import java.time.LocalDateTime;

public class Broadcast {
    private long id;
    private Event event;
    private String channel;
    private String message;
    private LocalDateTime scheduledOn;
    private String status;
    private int recipientsCount;

    public Broadcast(){}

    public Broadcast(Event event, String channel, String message, LocalDateTime scheduledOn, String status,
            int recipientsCount) {
        this.event = event;
        this.channel = channel;
        this.message = message;
        this.scheduledOn = scheduledOn;
        this.status = status;
        this.recipientsCount = recipientsCount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getScheduledOn() {
        return scheduledOn;
    }

    public void setScheduledOn(LocalDateTime scheduledOn) {
        this.scheduledOn = scheduledOn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRecipientsCount() {
        return recipientsCount;
    }

    public void setRecipientsCount(int recipientsCount) {
        this.recipientsCount = recipientsCount;
    }
    
}
