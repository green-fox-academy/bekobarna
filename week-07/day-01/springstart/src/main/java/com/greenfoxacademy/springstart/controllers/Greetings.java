package com.greenfoxacademy.springstart.controllers;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Greetings {
    long id;
    String content;

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
