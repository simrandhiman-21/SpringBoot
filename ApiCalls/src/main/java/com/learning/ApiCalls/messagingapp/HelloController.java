package com.learning.ApiCalls.messagingapp;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/get")
    public String gethello(){
        return "Hello from Get";
    }
    @PostMapping("/post")
    public String posthello(){
        return "Hello from Post";
    }
    @PutMapping("/put")
    public String puthello(){
        return "Hello from Put";
    }
    @DeleteMapping("/delete")
    public String deletehello(){
        return "Hello from Delete";
    }
}
