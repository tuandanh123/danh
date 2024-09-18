package com.example.learningeveryday.controller;

import com.example.learningeveryday.dto.request.UserCreationRequest;
import com.example.learningeveryday.dto.request.UserUpdateRequest;
import com.example.learningeveryday.entity.User;
import com.example.learningeveryday.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(UserCreationRequest userCreationRequest) {return userService.createUser(userCreationRequest);}

    @GetMapping("/[userId}")
    public User getUser(@PathVariable("userId") String userId){return userService.getUser(userId);}

    @GetMapping
    public List<User> getAllUsers(){return userService.getAllUsers();}

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable("userId") String userId){
        userService.deleteUser(userId);

        return "User deleted";
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable("userId") String userId, UserUpdateRequest userUpdateRequest){
        return userService.updateUser(userUpdateRequest,userId);
    }
}
