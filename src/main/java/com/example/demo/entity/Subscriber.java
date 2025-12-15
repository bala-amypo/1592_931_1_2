package com.example.demo.entity;

import java.time.LocalDateTime;

public class Subscriber {
    
    private long id;
    private String name;
    private String email;
    private String preferredCategories;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPreferredCategories() {
        return preferredCategories;
    }

    public void setPreferredCategories(String preferredCategories) {
        this.preferredCategories = preferredCategories;
    }

    public String getPreferredLocations() {
        return preferredLocations;
    }

    public void setPreferredLocations(String preferredLocations) {
        this.preferredLocations = preferredLocations;
    }

    public LocalDateTime getSubscribedOn() {
        return subscribedOn;
    }

    public void setSubscribedOn(LocalDateTime subscribedOn) {
        this.subscribedOn = subscribedOn;
    }

    private String preferredLocations;
    private LocalDateTime subscribedOn;

    public Subscriber(){}

    public Subscriber(String name, String email, String preferredCategories, String preferredLocations,
            LocalDateTime subscribedOn) {
        this.name = name;
        this.email = email;
        this.preferredCategories = preferredCategories;
        this.preferredLocations = preferredLocations;
        this.subscribedOn = subscribedOn;
    }

}
