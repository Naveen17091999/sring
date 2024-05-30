package com.example.SpringBoot.controller;

import com.example.SpringBoot.model.User;
import com.example.SpringBoot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/login")
    public String login(@RequestBody User user){
        return service.userLogin(user);
    }

    @PostMapping("/register")
    public String register(@RequestBody User user){
        return service.saveUser(user);
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return service.getAllUser();
    }
}
