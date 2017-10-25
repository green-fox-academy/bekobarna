package com.greenfox.bankofsimba.Model;


public class BankAccount {
    String name;
    String balance;
    String animalType;
    boolean isItAKing;
    boolean goodGuy;

    public BankAccount() {
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setItAKing(boolean itAKing) {
        isItAKing = itAKing;
    }

    public void setGoodGuy(boolean goodGuy) {
        this.goodGuy = goodGuy;
    }
}
