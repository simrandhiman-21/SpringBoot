package com.learning.IntroSpring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Controller
@RequestMapping("web")
public class HiController {

    //    @Controller expects you to return view names (like home.html, contact.html),
    //    If you want to return plain text like an API, you should use @RestController


    // Spring will search for an HTML view inside src/main/resources/templates/.

    //Thymeleaf
    //<dependency>
    //    <groupId>org.springframework.boot</groupId>
    //    <artifactId>spring-boot-starter-thymeleaf</artifactId>
    //</dependency>

    @RequestMapping("contact")
    public String contactpage(){
        log.info("Contact INfo in Console");
        return "contact";
    }

    @GetMapping("/message")
    public String message(Model model){
        model.addAttribute("message","This is Custom Message ");
        return "message";
    }
}
