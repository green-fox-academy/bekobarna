package com.greenfox.restbackend.controller;


import com.greenfox.restbackend.model.Doubling;
import com.greenfox.restbackend.model.DoublingError;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

    @RequestMapping(value = "/doubling", method = RequestMethod.GET)
    public Doubling doubling(@RequestParam(value = "input") int input) {
        Doubling doubling = new Doubling(input);
        return doubling;
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public DoublingError error () {
        return new DoublingError();
    }


}
