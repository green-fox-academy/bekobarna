package com.greenfox.colors.Model;

import com.greenfox.colors.MyColor;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;

public class RedColor implements MyColor {
    String colorName;


    @Autowired
    RedColor redColor;

    public void setRedColor() {
        this.colorName = "red";
    }

    @Override
    public void printColor() {
        System.out.println("It is " + colorName + " in color....");
    }
}
