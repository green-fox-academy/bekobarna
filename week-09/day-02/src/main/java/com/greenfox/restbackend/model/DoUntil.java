package com.greenfox.restbackend.model;

import java.util.Objects;

public class DoUntil {
    public int result;


    public DoUntil(String method, int until) {
        if (Objects.equals(method, "sum")) {
            this.result = sum(until);
        } else if (Objects.equals(method, "factor")) {
            this.result = factor(until);
        }
    }

    public int sum(int until) {
        int sum = 0;
        for (int i = 0; i <= until; i++) {
            sum += i;
        }
        return sum;
    }

    public int factor(int until) {
        int factor = 1;
        for (int i = 1; i <= until; i++) {
            factor *= i;
        }
        return factor;
    }

}
