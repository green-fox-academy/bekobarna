package com.greenfox.restbackend.controller;


import com.greenfox.restbackend.model.DoUntil;
import com.greenfox.restbackend.model.DoUntilError;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoUntilController {


    @RequestMapping(value = "/dountil/{what}", method = RequestMethod.POST)
    public DoUntil doUntil(@PathVariable ("what") String method, @RequestParam(value = "input") int input) {
        return new DoUntil(input, method);
    }

   /* @ExceptionHandler(MissingServletRequestParameterException.class)
    public DoUntilError error () {
        return new DoUntilError();
    }*/

}
