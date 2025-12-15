package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Event;
import com.example.demo.service.EventService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/events")
@Tag(name="Event Controller")

public class EventController {
    @Autowired
    EventService eventService;

    @GetMapping("/public")
    public List<Event> getAllPublicEvents(){
        return eventService.getAllPublicEvents();
    }

    @PostMapping
    public Event createEvent(Event event,long organizedId){
        return eventService.;
    }
}
