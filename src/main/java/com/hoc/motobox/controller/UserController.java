package com.hoc.motobox.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hoc.motobox.entity.User;
import com.hoc.motobox.utils.SuperController;
import com.hoc.motobox.utils.SuperRestService;

@RestController
@RequestMapping("/user")
public class UserController extends SuperController<User> {

    public UserController(SuperRestService<User> service) {
        super(service);
    }

}
