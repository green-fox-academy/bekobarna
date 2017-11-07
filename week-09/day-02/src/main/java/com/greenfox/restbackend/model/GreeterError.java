package com.greenfox.restbackend.model;

public class GreeterError {

    public String error;

    public GreeterError(String type) {
        this.error = "Please provide a " + type + "!";
    }
}
