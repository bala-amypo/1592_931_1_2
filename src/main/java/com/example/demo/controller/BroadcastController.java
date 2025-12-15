package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.service.BroadcastService;

import io.swagger.v3.oas.annotations.tags.Tag;

@ResponseStatus
@RequestMapping("/broadcasts")
@Tag(name = "Broadcast Controller")

public class BroadcastController {
    @Autowired
    BroadcastService broadcastService;
}
