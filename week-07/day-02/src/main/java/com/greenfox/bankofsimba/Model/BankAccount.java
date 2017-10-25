package com.greenfox.bankofsimba.Model;

import java.text.DecimalFormat;

public class BankAccount {
    String name;
    String balance;
    String animalType;


    /*public String decimal(String balance) {
        Float balanceFloat = Float.parseFloat(balance);
        DecimalFormat df = new DecimalFormat("0.00");
        df.setMaximumFractionDigits(2);
        balanceString = df.format(balanceFloat);
        return balanceString;
    }*/

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
