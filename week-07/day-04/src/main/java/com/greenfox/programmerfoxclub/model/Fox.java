package com.greenfox.programmerfoxclub.model;


import java.util.ArrayList;
import java.util.List;

public class Fox {
    String name;
    Foods food;
    Drinks drink;
    List<Tricks> listOfTricks;


    public Fox(String name, Foods food, Drinks drink,
        List<Tricks> listOfTricks) {
        this.name = name;
        this.food = food;
        this.drink = drink;
        this.listOfTricks = listOfTricks;
    }

    public List<Tricks> getListOfTricks() {
        return listOfTricks;
    }

    public void setListOfTricks(List<Tricks> listOfTricks) {
        this.listOfTricks = listOfTricks;
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
