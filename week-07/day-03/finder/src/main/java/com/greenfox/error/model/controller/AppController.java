package com.greenfox.error.model.controller;

import com.greenfox.error.model.User;
import com.greenfox.error.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aze on 25/10/17.
 */

@Controller
public class AppController {

    @Autowired
    UserService service;


    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("yolo", service.getAll());
        return "index";
    }

    @PostMapping(value = "/app")
    public String create() {
        service.save(new User());
        return "redirect:/";
    }
}