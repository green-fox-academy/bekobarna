package com.greenfox.programmerfoxclub.model;

import java.util.List;

public class Fox {
    String name;
    int tricksAmount;
    String food;
    String drink;
    List<String> lisOfTricks;

    public List<String> getLisOfTricks() {
        return lisOfTricks;
    }

    public void setLisOfTricks(String first, String second) {
    }

    public Fox(String name, int tricksAmount, String food, String drink,
        List<String> lisOfTricks) {
        this.name = name;
        this.tricksAmount = tricksAmount;
        this.food = food;
        this.drink = drink;
        this.lisOfTricks = lisOfTricks;
    }

    public Fox() {
    }

    public int getTricksAmount() {
        return tricksAmount;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTricksAmount(int tricksAmount) {
        this.tricksAmount = tricksAmount;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
