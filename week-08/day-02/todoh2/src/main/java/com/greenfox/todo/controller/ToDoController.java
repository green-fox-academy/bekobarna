package com.greenfox.todo.controller;

import com.greenfox.todo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToDoController {

    @Autowired
    ToDoRepository toDoRepository;


    @RequestMapping(value = {"/", "/list"})
    public String list (Model model) {
        model.addAttribute("save", toDoRepository.findAll());
        return "todo";
    }

}
