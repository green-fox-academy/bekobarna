package com.greenfox.programmerfoxclub.model;

public enum  Tricks {
    NONE(""),
    WRIIEINHTML("Write in HTML"),
    CODEINJAVA("Code in Java"),
    STYLEWITHCSS("Style with CSS"),
    PITY("Pity");

    private String name;

    Tricks(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

