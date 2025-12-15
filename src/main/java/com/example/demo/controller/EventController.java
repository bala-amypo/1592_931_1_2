package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Event;
import com.example.demo.service.EventService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/events")
@Tag(name="Events")

public class EventController {
    @Autowired
    EventService eventService;

    @GetMapping("/public")
    public List<Event> getAllPublicEvents(){
        return eventService.getAllPublicEvents();
    }

    @PostMapping("/create/{organizerId}")
    public Event createEvent(@RequestBody Event event,@PathVariable long organizedId){
        return eventService.createEvent(event, organizedId);
    }

    @GetMapping("/organizer/{organizerId}")
    public List<Event> getEventsByOrganizer(@PathVariable long organizedId){
        return eventService.getEventsByOrganizer(organizedId);
    }

    @GetMapping("/{eventId}")
    public Event getEvent(@PathVariable long eventId){
        return eventService.getEvent(eventId);
    }

    @DeleteMapping("/{eventId}/organizer/{organizerId}")
    public String deleteEvent(@PathVariable long eventId,@PathVariable long organizerId){
        return eventService.deleteEvent(eventId, organizerId);
    }
}
