package com.example.demo.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Broadcast;
import com.example.demo.service.BroadcastService;

@Service

public class BroadcastServiceImpl implements BroadcastService{
    public Broadcast scheduleBroadcast(long eventId,String channel,LocalDateTime scheduledOn){

    }
    Broadcast runBroadcast(long broadcastId){

    }
    List<Broadcast> getBroadcastsByEvent(long eventId){
        
    }
}
