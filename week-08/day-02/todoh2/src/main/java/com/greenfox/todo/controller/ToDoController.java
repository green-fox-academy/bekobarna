package com.greenfox.todo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class ToDoController {

    @RequestMapping(value = {"/", "/list"})
    @ResponseBody
    public String list (Model model) {
        return "This is my first todo";
    }

}
