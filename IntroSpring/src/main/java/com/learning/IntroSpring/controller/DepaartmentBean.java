package com.learning.IntroSpring.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class DepaartmentBean {
    public String getDepartmentName(){
        return "Software Developmenet";
    }
}
