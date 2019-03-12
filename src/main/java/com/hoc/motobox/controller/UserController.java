package com.hoc.motobox.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hoc.motobox.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("")
    public User createUser(@RequestBody User user) {
        return user;
    }

}