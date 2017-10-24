package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestControllers {
    AtomicLong counter = new AtomicLong(1);

    @ResponseBody
    @RequestMapping(value = "/greeting")
    public Greetings greeting (@RequestParam(value = "name") String name) {

        Greetings greetings = new Greetings(counter.getAndIncrement(), name);
        return greetings;
    }
}