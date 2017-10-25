package com.greenfox.bankofsimba.Model;


public class BankAccount {
    String name;
    String balance;
    String animalType;

    public BankAccount(String name, String balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
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
}
