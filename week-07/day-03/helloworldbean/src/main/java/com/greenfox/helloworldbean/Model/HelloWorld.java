package com.greenfox.helloworldbean.Model;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld {

    String message;

    @Autowired
    HelloWorld helloWorld;

    public void setMessage(){
        this.message = "Hello world!";
    }

    public void getMessage(){
        System.out.println("Your message: " + message);
    }
}