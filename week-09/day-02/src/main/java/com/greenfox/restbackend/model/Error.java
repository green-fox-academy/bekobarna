package com.greenfox.restbackend.model;

public class Error {

    public String error;

    public Error() {
        this.error = "Please provide an input!";
    }

    public Error(String type) {
        this.error = "Please provide a " + type + "!";
    }
}
