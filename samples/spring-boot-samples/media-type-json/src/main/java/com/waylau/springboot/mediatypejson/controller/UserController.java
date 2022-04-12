package com.waylau.springboot.mediatypejson.controller;

import com.waylau.springboot.mediatypejson.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @RequestMapping("/{id}")
    public User getUser(@PathVariable("id") Long id) {
        return new User(id,"waylau", "waylau521@gmail.com");
    }
}