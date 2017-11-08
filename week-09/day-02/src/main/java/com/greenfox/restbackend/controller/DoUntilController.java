package com.greenfox.restbackend.controller;


import com.greenfox.restbackend.model.DoUntil;
import com.greenfox.restbackend.model.DoUntilError;
import com.greenfox.restbackend.model.Until;
import javassist.NotFoundException;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
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
        return new DoUntil(method, until.getUntil());
    }

    @ExceptionHandler({HttpMessageNotReadableException.class})
    public DoUntilError doUntilError () {
        return new DoUntilError();
    }

}
