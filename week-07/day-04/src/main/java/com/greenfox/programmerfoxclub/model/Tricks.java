package com.greenfox.programmerfoxclub.model;

public enum  Tricks {
    WRIIEINHTML("Write in HTML"),
    CODEINJAVA("Code in Java"),
    STYLEWITHCSS("Style with CSS"),
    UPLOADTOGITHUB("Upload to Github");

    private String name;

    Tricks(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

