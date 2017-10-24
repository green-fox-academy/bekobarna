package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.SpringstartApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestControllers {

    public static void main(String[] args) {
        SpringApplication.run(SpringstartApplication.class, args);
    }

    @RequestMapping(value = "/greeting")
    @ResponseBody
    public Greetings greeting () {
        Greetings greetings = new Greetings(22, "Hello, you!");
        return greetings;
    }
}