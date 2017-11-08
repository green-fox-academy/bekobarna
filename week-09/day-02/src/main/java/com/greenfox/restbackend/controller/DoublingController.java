package com.greenfox.restbackend.controller;


import com.greenfox.restbackend.model.Doubling;
import com.greenfox.restbackend.model.Error;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

    @RequestMapping(value = "/doubling", method = RequestMethod.GET)
    public Doubling doubling(@RequestParam Integer input) {
        return new Doubling(input);
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public Error error() {
        return new Error();
    }

}
