package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestControllers {

    @ResponseBody
    @RequestMapping(value = "/greeting")
    public Greetings greeting (@RequestParam(value = "name") String name) {
        Greetings greetings = new Greetings(1, name);
        return greetings;
    }
}