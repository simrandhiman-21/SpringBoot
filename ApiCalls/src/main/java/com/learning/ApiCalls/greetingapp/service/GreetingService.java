package com.learning.ApiCalls.greetingapp.service;

import com.learning.ApiCalls.greetingapp.model.Greeting;
import com.learning.ApiCalls.greetingapp.model.User;
import com.learning.ApiCalls.greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    // UC2
    public Greeting getName() {
        return new Greeting("Hello World !!");
    }

    // UC3 + UC4
    public Greeting helloAccToName(User user) {
        String message;
        if (user.getFirstName() != null && !user.getFirstName().isEmpty() &&
                user.getLastName() != null && !user.getLastName().isEmpty()) {
            message = "Hello " + user.getFirstName() + " " + user.getLastName();
        } else if (user.getFirstName() != null && !user.getFirstName().isEmpty()) {
            message = "Hello " + user.getFirstName();
        } else if (user.getLastName() != null && !user.getLastName().isEmpty()) {
            message = "Hello " + user.getLastName();
        } else {
            message = "Hello World!!!";
        }

        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);
    }

    public void saveGreeting(User user) {
        helloAccToName(user); // already saves inside
    }

    // UC5
    public String messageById(Long id) {
        return greetingRepository.findById(id)
                .map(Greeting::getMessage) // Assuming Greeting has a getMessage() method
                .orElseThrow(() -> new RuntimeException("Greeting not found with ID " + id));
    }

    // UC6
    public List<Greeting> findAllMessages() {
        return greetingRepository.findAll();
    }

    // UC7
    public Greeting editMessage(long id, Greeting updatedGreeting) {
        return greetingRepository.findById(id)
                .map(existingGreeting -> {
                    existingGreeting.setMessage(updatedGreeting.getMessage());
                    return greetingRepository.save(existingGreeting);
                }).orElse(null);
    }

    // UC8
    public String deleteMessage(long id) {
        return greetingRepository.findById(id)
                .map(greeting -> {
                    greetingRepository.delete(greeting);
                    return "Deleted Successfully";
                }).orElse("Greeting not found");
    }
}
