package com.learning.ApiCalls.greetingapp.model;

import jakarta.persistence.Entity;
import lombok.Data;


@Data
public class User {
    private String firstName;
    private String lastName;

    // Required by Spring (Jackson)
    public User() {
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
