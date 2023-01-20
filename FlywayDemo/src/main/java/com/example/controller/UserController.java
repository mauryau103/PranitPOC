package com.example.controller;

import com.example.Repo.UserRepo;
import com.example.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @PostMapping("/post")
    public User postUser(@RequestBody User user){

        return userRepo.save(user);

    }
    @GetMapping
    public List<User> getAll(User user){
        return userRepo.findAll();
    }


}
