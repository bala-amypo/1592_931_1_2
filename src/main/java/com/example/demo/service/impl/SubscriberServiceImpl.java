package com.example.demo.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Subscriber;
import com.example.demo.service.SubscriberService;

@Service
public class SubscriberServiceImpl implements SubscriberService {
    Subscriber s;
    List<Subscriber> list;
    public Subscriber registSubscriber(Subscriber sub){
        return s;
    }
    public List<Subscriber> getAllSubscribers(){
        return list;
    }
    public List<Subscriber> findMatchingSubscribers(String category,String location){
        return list;
    }   
}
