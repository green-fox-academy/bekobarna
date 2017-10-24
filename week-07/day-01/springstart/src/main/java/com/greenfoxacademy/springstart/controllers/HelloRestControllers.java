package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestControllers {

    @RequestMapping(value = "/greeting")
    public Greetings greeting () {
        Greetings greetings = new Greetings(22, "Hello, you!");
        return greetings;
    }
}