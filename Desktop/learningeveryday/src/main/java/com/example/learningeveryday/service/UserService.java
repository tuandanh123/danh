package com.example.learningeveryday.service;

import com.example.learningeveryday.dto.request.UserCreationRequest;
import com.example.learningeveryday.dto.request.UserUpdateRequest;
import com.example.learningeveryday.entity.User;
import com.example.learningeveryday.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(UserCreationRequest userCreationRequest){
        User user = new User();

        user.setUsername(userCreationRequest.getUsername());
        user.setPassword(userCreationRequest.getPassword());
        user.setFirstname(userCreationRequest.getFirstname());
        user.setLastname(userCreationRequest.getLastname());
        user.setDbo(userCreationRequest.getDbo());

        return userRepository.save(user);
    }

    public User getUser(String Id){return userRepository.findById(Id).orElseThrow(() -> new RuntimeException("User not found"));}

    public List<User> getAllUsers(){return userRepository.findAll();}

    public User updateUser(UserUpdateRequest userUpdateRequest, String Id){
        User user = getUser(Id);

        user.setPassword(userUpdateRequest.getPassword());
        user.setFirstname(userUpdateRequest.getFirstname());
        user.setLastname(userUpdateRequest.getLastname());
        user.setDbo(userUpdateRequest.getDbo());

        return userRepository.save(user);
    }

    public void deleteUser(String Id){userRepository.deleteById(Id);}
}
