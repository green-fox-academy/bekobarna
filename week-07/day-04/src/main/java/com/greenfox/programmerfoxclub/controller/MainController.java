package com.greenfox.programmerfoxclub.controller;


import com.greenfox.programmerfoxclub.model.Fox;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    Fox fox;

    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("name", fox.getName());
        model.addAttribute("food", fox.getFood());
        model.addAttribute("drink", fox.getDrink());
        model.addAttribute("tricksamount", fox.getTricksAmount());
        return "index";
    }

    @RequestMapping(value = "/information")
    public String information (Model model) {
        fox.setName("Mr.Green");
        fox.setFood("salad");
        fox.setDrink("water");
        fox.setTricksAmount(2);
        model.addAttribute("name", fox.getName());
        model.addAttribute("food", fox.getFood());
        model.addAttribute("drink", fox.getDrink());
        model.addAttribute("tricksamount", fox.getTricksAmount());
        return "information";
    }

}
