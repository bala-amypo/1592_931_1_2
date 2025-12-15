package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.entity.Broadcast;

public interface BroadcastService {
    Broadcast scheduleBroadcast(long eventId,String channel,LocalDateTime scheduledOn);
    Broadcast runBroadcast(long broadcastId);
    List<Broadcast> getBroadcastsByEvent(long eventId);
}