//package com.learning.ApiCalls.messagingapp;
//
//import org.springframework.web.bind.annotation.*;
//
////Using GreetingControllerusingJsonReturn  //return JSON for different //HTTP Methods. Test
////using curl
//
//@RestController
//@RequestMapping("/greeting")
//public class GreetingControllerusingJsonReturn {
//
//    //browser
//    @GetMapping("/get")
//    public Greeting gethello(){
//        return new Greeting("HELLO VIA GET! ");
//    }
//    //postman
//    @PostMapping("/post")
//    public Greeting posthello(){
//        return new Greeting("HELLO VIA POST! ");
//    }
//    @PutMapping("/put")
//    public Greeting puthello(){
//        return new Greeting("HELLO VIA PUT");
//    }
//    @DeleteMapping("/delete")
//    public Greeting deletehello(){
//        return new Greeting("HELLO VIA DELETE");
//    }
//
//
//}
