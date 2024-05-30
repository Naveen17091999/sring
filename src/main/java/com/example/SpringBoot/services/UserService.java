package com.example.SpringBoot.services;

import com.example.SpringBoot.model.User;
import com.example.SpringBoot.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public String saveUser(User user){
        repo.save(user);
        return "User added.";
    }

    public List<User> getAllUser(){
        return repo.findAll();
    }

    public String userLogin(User user){
        Optional<User> userExist = repo.findByEmail(user.getEmail());
        if(userExist.isPresent()){
            return "User logged.";
        }
        return "User don't exist.";
    }
}
