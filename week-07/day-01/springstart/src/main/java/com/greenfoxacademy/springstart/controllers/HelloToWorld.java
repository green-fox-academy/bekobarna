package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloToWorld {
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
        "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
        "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
        "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    String[] colors = {"red", "blue", "yellow"};


    @RequestMapping("/web/greetingworld")
    public String greeting(Model model, @RequestParam(value = "name") String name) {
        model.addAttribute("greeting", getRandomHellos());
        model.addAttribute("name", name);
        model.addAttribute("num", getRandomNumber());

        return "greeting";
    }

    public String getRandomHellos() {
        return hellos[(int) (Math.random() * hellos.length)];
    }

    public String getRandomColors() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public int getRandomNumber() {
        return (int) (Math.random() * 255);
    }

}