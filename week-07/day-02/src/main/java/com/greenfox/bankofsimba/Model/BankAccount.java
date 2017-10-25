package com.greenfox.bankofsimba.Model;


public class BankAccount {
    String name;
    String balance;
    String animalType;
    boolean isItAKing;
    boolean goodGuy;

    public BankAccount(String name, String balance, String animalType, boolean isItAKing, boolean goodGuy) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isItAKing = isItAKing;
        this.goodGuy = goodGuy;
    }

    public String getName() {
        return name;
    }

    public String  getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public boolean isItAKing() {
        return isItAKing;
    }

    public boolean isGoodGuy() {
        return goodGuy;
    }
}
