package com.example.SpringBoot.service;

import com.example.SpringBoot.model.UserDetails;
import com.example.SpringBoot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSevice {
    @Autowired
    private UserRepository repository;

    public String adduser(UserDetails user){
        repository.save(user);
        return "user added";
    }

    public List<UserDetails> getAllUsers(){
         return repository.findAll();
    }

    public String updateUsers(UserDetails user, int id) {
        UserDetails existing = repository.findById(id).get();
        existing.setUsername(user.getUsername());
        existing.setEmail(user.getEmail());
        existing.setAge(user.getAge());
        repository.save(existing);
        return "use updated";
    }
}
