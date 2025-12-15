package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Event;
import com.example.demo.service.EventService;

@Service
public class EventServiceImpl implements EventService  {
    Event e;
    List<Event> list;
    public Event createEvent(Event event,long organizedId){
        return e;
    }
    public List<Event> getAllPublicEvents(){
        return list;
    }
    public List<Event> getEventsByOrganizer(long organizedId){
        return list;
    }
    public Event geEvent(long eventId){
        return e;
    }
    public String deleteEvent(long eventId,long organizerId){
        return "Hi";
    }
}
