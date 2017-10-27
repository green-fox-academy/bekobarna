package com.greenfox.programmerfoxclub.controller;

import com.greenfox.programmerfoxclub.model.Drinks;
import com.greenfox.programmerfoxclub.model.Foods;
import com.greenfox.programmerfoxclub.model.Fox;
import com.greenfox.programmerfoxclub.model.Tricks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    Fox fox;

    @RequestMapping(value = "/")
    public String information (Model model) {
        fox.setName("Mr.Green");
        fox.setFood(Foods.SALAD);
        fox.setDrink(Drinks.WATER);
        model.addAttribute("name", fox.getName());
        model.addAttribute("food", fox.getFood());
        model.addAttribute("drink", fox.getDrink());
        model.addAttribute("tricks", Tricks.values());
        model.addAttribute("tricksAmount", Tricks.values().length);
        return "information";
    }

    @RequestMapping(value = "/nutritionstore")
    public String nutritionStore (Model model) {
        model.addAttribute("foods", Foods.values());
        model.addAttribute("drinks", Drinks.values());
        return "nutritionstore";
    }

    @RequestMapping(value = "/trickcenter")
    public String trickcenter (Model model) {
        model.addAttribute("tricks", Tricks.values());
        return "trickcenter";
    }

}