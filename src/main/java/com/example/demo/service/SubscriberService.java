package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Subscriber;

public interface SubscriberService {
    Subscriber registSubscriber(Subscriber sub);
    List<Subscriber> getAllSubscribers();
    List<Subscriber> findMatchingSubscribers(String category,String location);   
}
