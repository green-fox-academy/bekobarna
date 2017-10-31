package com.greenfox.programmerfoxclub.controller;

import com.greenfox.programmerfoxclub.model.DrinkEnums;
import com.greenfox.programmerfoxclub.model.Foods;
import com.greenfox.programmerfoxclub.model.Fox;
import com.greenfox.programmerfoxclub.model.Tricks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    Fox fox;


    @RequestMapping(value = "/")
    public String information (Model model) {
        model.addAttribute("fox", fox);
       /* model.addAttribute("name", fox.getName());
        model.addAttribute("food", fox.getFood());
        model.addAttribute("drink", fox.getDrink());
        model.addAttribute("trickssize", fox.getListOfTricks().size());
        model.addAttribute("tricks", fox.getListOfTricks());*/
        return "information";
    }

    @RequestMapping(value = "/nutritionstore")
    public String nutritionStore (Model model) {
        model.addAttribute("fox", fox);
        model.addAttribute("foods", Foods.values());
        model.addAttribute("drinks", DrinkEnums.values());
        model.addAttribute("drinkAdd", DrinkEnums.values());
        return "nutritionstore";
    }

    @RequestMapping(value = "/trickcenter")
    public String trickcenter (Model model) {
        model.addAttribute("tricks", Tricks.values());
        model.addAttribute("trickAdd", Tricks.CODEINJAVA);
        return "trickcenter";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Fox fox) {
        this.fox.setDrink(fox.getDrink());
        return "redirect:/";
    }

}