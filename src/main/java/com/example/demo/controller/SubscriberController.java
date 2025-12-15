package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Subscriber;
import com.example.demo.service.SubscriberService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/subscribers")
@Tag(name="Subscribers")

public class SubscriberController {
    @Autowired
    SubscriberService subscriberService;

    @PostMapping("/register")
    public Subscriber registSubscriber(@RequestBody Subscriber sub){
        return subscriberService.registSubscriber(sub);
    }

    @GetMapping("/all")
    public List<Subscriber> getAllSubscribers(){
        return subscriberService.getAllSubscribers();
    }

    @GetMapping("/match")
    public List<Subscriber> findMatchingSubscribers(@PathVariable String category,@PathVariable String location){
        return subscriberService.findMatchingSubscribers(category, location);
    }
}
