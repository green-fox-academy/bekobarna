package com.greenfox.restbackend.controller;


import com.greenfox.restbackend.model.Greeter;
import com.greenfox.restbackend.model.GreeterError;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

    @RequestMapping(value = "/greeter", method = RequestMethod.GET)
    public Greeter greeter(@RequestParam(value = "name") String name,
        @RequestParam(value = "title") String title) {
        return new Greeter(name, title);
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public GreeterError handleMissingName(MissingServletRequestParameterException ex) {
        String type = ex.getParameterName();
        return new GreeterError(type);
    }

}
