package com.greenfox.restbackend.controller;


import com.greenfox.restbackend.model.Append;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendController {

    @RequestMapping(value = "/appenda/{appendable}", method = RequestMethod.GET)
    public Append append(@PathVariable(value = "appendable") String append ) {
        return new Append(append);
    }
}
