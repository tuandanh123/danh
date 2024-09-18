package com.example.learningeveryday.dto.request;

import java.time.LocalDate;

public class UserUpdateRequest {
    private String password;
    private String firstname;
    private String lastname;
    private LocalDate dbo;

    public String getPassword() {
        return password;
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
