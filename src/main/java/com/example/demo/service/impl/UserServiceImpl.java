package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    User u;
    public User saveUser(User user){
        return u;
    }
    public User findByEmail(String email){
        return u;
    }
}
