package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/api/v1/greeting")
    public String greeting(
             @RequestParam(value="name", defaultValue="Tom") String name) {
        String greeting = "Hello";

        Message m = new Message(4, greeting, name);
        return greeting + " " + name;
    }
}