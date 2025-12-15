package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.entity.Broadcast;
import com.example.demo.service.BroadcastService;

import io.swagger.v3.oas.annotations.tags.Tag;

@ResponseStatus
@RequestMapping("/broadcasts")
@Tag(name = "Broadcast Controller")

public class BroadcastController {
    @Autowired
    BroadcastService broadcastService;

    @PostMapping("/schedule/{eventId}")
    public Broadcast scheduleBroadcast(@PathVariable long eventId,@PathVariable String channel,@PathVariable LocalDateTime scheduledOn){
        return broadcastService.scheduleBroadcast(eventId,channel,scheduledOn);
    }

    @PostMapping("/run/{broadcasId}")
    public Broadcast runBroadcast(@PathVariable long broadcastId){
        return broadcastService.runBroadcast(broadcastId);
    }

    @GetMapping("/event/{eventId}")
    public List<Broadcast> getBroadcastsByEvent(@PathVariable long eventId){
        return broadcastService.getBroadcastsByEvent(eventId);
    }

    @GetMapping("/{broadcastId}/logs")
    public List<Broadcast> getBroadcastsByEvent(@PathVariable long eventId){
        return broadcastService.getBroadcastsByEvent(eventId);
    }
}
