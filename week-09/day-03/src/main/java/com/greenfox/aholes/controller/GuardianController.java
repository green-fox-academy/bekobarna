package com.greenfox.aholes.controller;

import com.greenfox.aholes.model.Guardian;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @GetMapping(value = "/groot")
    public Object groot(@RequestParam String message ) {
        if (message == null) {
            return new Error("I am Groot!");
        }
        return new Guardian(message);
    }

    /*@ExceptionHandler(MissingServletRequestParameterException.class)
    public Object grootError() {
        return new Error("I am Groot!");
    }*/
}
