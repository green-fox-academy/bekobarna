package com.greenfox.restbackend.model;

import java.util.Objects;

public class Array {

    public int[] numbers;
    public Object result;

    public Array() {
    }

    public Array(String what, Array array) {
        if (Objects.equals(what, "sum")) {
            this.result = sum(array.numbers);
        } else if (Objects.equals(what, "multiply")) {
            this.result = multiply(array.numbers);
        } else if (Objects.equals(what, "double")) {
            this.result = doubling(array.numbers);
        }
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public int multiply(int[] array) {
        int multi = 1;
        for (int i = 1; i < array.length; i++) {
            multi = array[i] * array[i-1];
        }
        return multi;
    }

    public int[] doubling(int[] array) {
        int[] doubled = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            doubled[i] = (array[i] * 2);
        }
        return doubled;
    }
}