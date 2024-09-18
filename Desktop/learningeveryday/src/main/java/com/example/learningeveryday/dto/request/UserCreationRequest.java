package com.example.learningeveryday.dto.request;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class UserCreationRequest {
    @Size(min = 2, message = "password at least 2 words")
    private String password;
    private String username;
    private String firstname;
    private String lastname;
    private LocalDate dbo;

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getDbo() {
        return dbo;
    }
}
