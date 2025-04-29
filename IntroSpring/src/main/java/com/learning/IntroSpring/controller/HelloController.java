package com.learning.IntroSpring.controller;

import com.learning.IntroSpring.model.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.Thymeleaf;

import java.util.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    private static final Map<String, String> storedData = new HashMap<>();

//    @Controller expects you to return view names (like home.html, contact.html),
//    If you want to return plain text like an API, you should use @RestController

    @RequestMapping("/home")
    public String sayhello(){
        return "Hello , Welcome to our Spring Home Page";
    }


   //@RequestParam, use ?name=YourName in URL.
            //http://localhost:8080/query?name=simran
    @GetMapping("/query")
    public String sayhelloQuery(@RequestParam String name){
        storedData.put(name,"Storted in DataBase ");
        return "Welocome "+ name + "  our WEBPage ";
    }

    //@PathVariable, attach /YourName directly in URL.
        //http://localhost:8080/param/simran
    @GetMapping("/param/{name}")
    public String sayhelloparam(@PathVariable String name){
        storedData.put(name,"Storted in DataBase ");
        return "Welocome "+ name + "  our WEBPage ";
    }

    //@RequestBody, you need to send a JSON body (use Postman or any HTTP client).
    @PostMapping("/post")
    public String sayhelloPost(@RequestBody Users user){
        storedData.put(user.getName(), "Stored in DataBase");
        return "Welcome "+user.getName();
    }

    //One in the URL (what you are updating — like an ID or old name),
    //One in the Body (new updated data).

    @PutMapping("/update/{oldname}")
    public String sayhelloPut(@PathVariable String oldname, @RequestBody Users user){
        if(storedData.containsKey(oldname)){
            storedData.remove(oldname);
            storedData.put(user.getName(), "Stored in DataBase");
            return "Updated Hello from " + oldname + " to " + user.getName();
        }else {
            return "Updated Hello from " + oldname + " to " + user.getName();
        }
    }

    @DeleteMapping("/param/{name}")
    public String sayhellodelete(@PathVariable String name){
        if (storedData.containsKey(name)) {
            storedData.remove(name);
            return "Deleted user " + name;
        } else {
            return "User " + name + " not found for deletion.";
        }

    }


    @GetMapping("/getallnames")
    public String printallNames(){
        Set<String> listnames=storedData.keySet();
        if(listnames.isEmpty()){
            return "No names found.";
        }
        else{
            return "All stored names: " +String.join(", ", listnames);
        }
    }






}
