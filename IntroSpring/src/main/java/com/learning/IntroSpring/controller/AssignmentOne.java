package com.learning.IntroSpring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apicalls")
public class AssignmentOne {

    @GetMapping("/get")
    public String sayehhlo(){
        return "hello from get";
    }
    //http://localhost:8080/apicalls/query?name=simran
    @GetMapping("/query")
    public String sayehhloo(@RequestParam String name){
        return "Hello "+name;
    }

    //http://localhost:8080/apicalls/pathvariable/dhiman
    //{} is syntax
    @GetMapping("/pathvariable/{name}")
    public String sayehhle(@PathVariable String name){
        return "Hello "+name;
    }

    //get read
    //post create or send

    //http://localhost:8080/apicalls/post/simran?newName=priya
    @PostMapping("/post/{oldname}")
    public String sayehhleie(@PathVariable String oldname,@RequestParam String newName){
        return "Name changed to  "+oldname+"  NewName "+newName;
    }

}
