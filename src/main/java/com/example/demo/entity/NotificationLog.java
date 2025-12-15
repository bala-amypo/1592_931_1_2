package com.example.demo.entity;

import java.time.LocalDateTime;

public class NotificationLog {
    private long id;
    private Broadcast broadcast;
    private String recipientEmail;
    private LocalDateTime sentOn;
    private String status;

    public NotificationLog(){}

    public NotificationLog(Broadcast broadcast, String recipientEmail, LocalDateTime sentOn, String status) {
        this.broadcast = broadcast;
        this.recipientEmail = recipientEmail;
        this.sentOn = sentOn;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Broadcast getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(Broadcast broadcast) {
        this.broadcast = broadcast;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    public LocalDateTime getSentOn() {
        return sentOn;
    }

    public void setSentOn(LocalDateTime sentOn) {
        this.sentOn = sentOn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
