package com.greenfox.programmerfoxclub.model;


import java.util.ArrayList;
import java.util.List;

public class Fox {
    String name;
    Foods food;
    Drinks drink;
    Tricks tricks;


    public Fox(String name, Foods food, Drinks drink, Tricks tricks) {
        this.name = name;
        this.food = food;
        this.drink = drink;
        this.tricks = tricks;
    }

    public Tricks getTricks() {
        return tricks;
    }

    public void setTricks(Tricks tricks) {
        this.tricks = tricks;
    }

    public Fox() {
    }

    public Foods getFood() {
        return food;
    }

    public void setFood(Foods food) {
        this.food = food;
    }

    public Drinks getDrink() {
        return drink;
    }

    public void setDrink(Drinks drink) {
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
