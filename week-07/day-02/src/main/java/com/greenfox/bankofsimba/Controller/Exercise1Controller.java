package com.greenfox.bankofsimba.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Exercise1Controller {


    @RequestMapping(value = "/Exercise1")
    public String account (Model model) {
        model.addAttribute("name", "Simba");
        model.addAttribute("balance", "2000");
        model.addAttribute("animalType", "lion");
        return "Exercise1";
    }

}
