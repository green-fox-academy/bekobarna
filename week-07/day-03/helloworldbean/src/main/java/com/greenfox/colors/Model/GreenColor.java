package com.greenfox.colors.Model;

import com.greenfox.colors.MyColor;
import org.springframework.beans.factory.annotation.Autowired;

public class GreenColor implements MyColor {
    String colorName;


    @Autowired
    GreenColor greenColor;

    public void setGreenColor() {
        this.colorName = "green";
    }

    @Override
    public void printColor() {
        System.out.println("It is " + colorName + " in color....");
    }
}
