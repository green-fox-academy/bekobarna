package com.greenfox.restbackend.controller;


import com.greenfox.restbackend.model.DoUntil;
import com.greenfox.restbackend.model.DoUntilError;
import com.greenfox.restbackend.model.Until;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoUntilController {


    @RequestMapping(value = "/dountil/{what}", method = RequestMethod.POST)
    public DoUntil doUntil(@RequestBody Until until, @PathVariable ("what") String method) {
        return new DoUntil(until.getUntil(), method);
    }

    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
    public DoUntilError error () {
        return new DoUntilError();
    }

}
