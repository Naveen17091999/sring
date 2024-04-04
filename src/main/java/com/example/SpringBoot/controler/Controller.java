package com.example.SpringBoot.controler;


import com.example.SpringBoot.model.UserDetails;
import com.example.SpringBoot.service.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class Controller {
    @Autowired
    private UserSevice service;
    @PostMapping
    public String newUser(@RequestBody UserDetails user){
        return service.adduser(user);
    }

    @GetMapping
    public List<UserDetails> getUsers(){
        return service.getAllUsers();
    }

    @PutMapping("/{id}")
    public String updateUser(@RequestBody UserDetails user, @PathVariable int id){
        return  service.updateUsers(user, id);
    }
}
