package com.greenfox.todo.controller;

import com.greenfox.todo.model.ToDo;
import com.greenfox.todo.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/todo")
public class ToDoController {

    @Autowired
    ToDoRepository toDoRepository;


    @RequestMapping(value = {"/"})
    public String list (Model model) {
        model.addAttribute("todos", toDoRepository.findAll());
        return "todo";
    }

   /* @RequestMapping(value = {"/done"})
    public String listdone (Model model, @RequestParam(value = "isActive", required = false) boolean done) {
        model.addAttribute("done", done);
        model.addAttribute("todos", toDoRepository.findAll());
        return "todo";
    }*/

    @RequestMapping(value = "/addForm", method = RequestMethod.GET)
    public String addTodo() {
        return "add";
    }

    @RequestMapping(value = "/submitForm", method = RequestMethod.POST)
    public String submitToDo(@RequestParam String title){
    toDoRepository.save(new ToDo(title));
    return "redirect:/todo/";
    }

}