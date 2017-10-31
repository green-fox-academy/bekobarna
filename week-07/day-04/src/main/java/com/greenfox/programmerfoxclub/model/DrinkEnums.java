package com.greenfox.programmerfoxclub.model;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Drinks {
    List<String> drinks;

    public String getDrink() {

    }

        BEER("Beer"),
        WHISKEY("Whiskey"),
        VODKA("Vodka"),
        WATER("Water");

        private String name;

        DrinkEnums(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }

}
