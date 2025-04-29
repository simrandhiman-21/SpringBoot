package com.learning.IntroSpring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j

public class Loggers {

    @GetMapping("/profile")
    public String loggermethod(){
        log.info("user Entered Profile");
        return "Welcome to Profile";
    }

}
