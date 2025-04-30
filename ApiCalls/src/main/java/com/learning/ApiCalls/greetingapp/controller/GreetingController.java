package com.learning.ApiCalls.greetingapp.controller;

import com.learning.ApiCalls.greetingapp.model.Greeting;
import com.learning.ApiCalls.greetingapp.model.User;
import com.learning.ApiCalls.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    // UC1 - Test different HTTP methods
    @GetMapping
    public Greeting getMethod() {
        return new Greeting("Hi from GET");
    }

    @PostMapping
    public Greeting postMethod() {
        return new Greeting("Hi from POST");
    }

    @PutMapping
    public Greeting putMethod() {
        return new Greeting("Hi from PUT");
    }

    @DeleteMapping
    public Greeting deleteMethod() {
        return new Greeting("Hi from DELETE");
    }

    // UC2 - Simple greeting from service
    @GetMapping("/getservice")
    public Greeting getService() {
        return greetingService.getName();
    }

    // UC3 - Greeting based on User name
    @PostMapping("/post")
    public Greeting helloAccToName(@RequestBody User user) {
        return greetingService.helloAccToName(user);
    }

    // UC4 - Save greeting to repository
    @PostMapping("/save")
    public void saveGreeting(@RequestBody User user) {
        greetingService.saveGreeting(user);
    }

    // UC5 - Find greeting by ID
    @GetMapping("/{id}")
    public String messageById(@PathVariable Long id) {
        return greetingService.messageById(id);
    }

    // UC6 - List all greetings
    @GetMapping("/all")
    public List<Greeting> getAllMessages() {
        return greetingService.findAllMessages();
    }

    // UC7 - Edit greeting by ID
    @PutMapping("/edit/{id}")
    public Greeting editMessage(@PathVariable long id, @RequestBody Greeting message) {
        return greetingService.editMessage(id, message);
    }

    // UC8 - Delete greeting by ID
    @DeleteMapping("/delete/{id}")
    public String deleteMessage(@PathVariable long id) {
        return greetingService.deleteMessage(id);
    }
}
