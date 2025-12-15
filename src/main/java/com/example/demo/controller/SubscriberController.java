package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SubscriberService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/subscribers")
@Tag(name="Subscriber Controller")

public class SubscriberController {
    @Autowired
    SubscriberService subscriberService;

    @PostMapping
    
}
