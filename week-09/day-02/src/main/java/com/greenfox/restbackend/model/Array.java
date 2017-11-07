package com.greenfox.restbackend.model;

import java.util.List;
import java.util.Objects;

public class Array {

    public String what;
    public List<Integer> numbers;


    public Array(String what, List<Integer> numbers) {
        this.what = what;
        if (Objects.equals(what, "sum")) {
            this.numbers = sum(numbers);

        } else if (Objects.equals(what, "multiply")) {
            this.numbers = multiply(numbers);

        } else if (Objects.equals(what, "double")) {
            this.numbers = doubling(numbers);
        }
    }

    public List<Integer> sum(List<Integer> until) {
        List<Integer> tempList = null;
        for (int i = 0; i < until.size(); i++) {

        }
        return tempList;
    }

    public List<Integer> multiply(List<Integer> until) {
        List<Integer> tempList = null;
        for (int i = 0; i <= until.size(); i++) {

        }
        return tempList;
    }

    public List<Integer> doubling(List<Integer> until) {
        List<Integer> tempList = null;
        for (int i = 0; i <= until.size(); i++) {

        }
        return tempList;
    }
}