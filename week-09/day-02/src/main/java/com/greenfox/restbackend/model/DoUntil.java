package com.greenfox.restbackend.model;

import java.util.Objects;

public class DoUntil {
    public int until;
    public int result;

    public DoUntil(int until, String type) {
        this.until = until;
        if (Objects.equals(type, "sum")) {
            this.result = sum(until);
        } else if (Objects.equals(type, "factor "))
            this.result = factor(until);
        this.until = until;
    }

    public int sum(int input) {
        int temp = 0;
        for (int i = 0; i < input; i++) {
            temp += input;
        }
        return temp;
    }

    public int factor(int input) {
        int temp = 0;
        for (int i = 0; i < input; i++) {
            temp *= input;
        }
        return temp;
    }
}
