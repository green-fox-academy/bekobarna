package com.greenfox.restbackend.controller;


import com.greenfox.restbackend.model.Array;
import com.greenfox.restbackend.model.ArrayError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayController {

    @RequestMapping(value = "/arrays/{array}", method = RequestMethod.POST)
    public Object array(@PathVariable(value = "array") String type, @RequestBody Array array) {
        return new Array(type, array);
    }

    @ExceptionHandler(NullPointerException.class)
    public ArrayError error() {
        return new ArrayError();
    }
}
