package com.example.demo.service;
import java.util.List;

import com.example.demo.entity.Event;

public interface EventService {
    Event createEvent(Event event,long organizedId); 
    List<Event> getAllPublicEvents();
    List<Event> getEventsByOrganizer(long organizedId);
    Event getEvent(long eventId);
    String deleteEvent(long eventId,long organizerId);
}