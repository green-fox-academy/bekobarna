package com.greenfox.todo.controller;

import com.greenfox.todo.model.ToDo;
import com.greenfox.todo.repository.ToDoRepository;
import com.greenfox.todo.service.DateProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/todo")
public class ToDoController {

    @Autowired
    ToDoRepository toDoRepository;

    @Autowired
    DateProvider dateProvider;


    @RequestMapping(value = {"","/"})
    public String list (Model model) {
        model.addAttribute("todos", toDoRepository.findAll());
        return "todo";
    }

    @GetMapping(value = "/addForm")
    public String addTodo() {
        return "add";
    }

    @PostMapping(value = "/submitForm")
    public String submitToDo(@RequestParam String title, @RequestParam(value = "duedate") String date){
        toDoRepository.save(new ToDo(title, dateProvider.newdate(date)));
    return "redirect:/todo/";
    }

    @GetMapping(value = "/{id}/delete")
    public String delete(@PathVariable int id) {
        toDoRepository.delete(id);
        return "redirect:/todo/";
    }

    @GetMapping(value = "/{id}/edit")
    public String getEdit(Model model, @PathVariable int id) {
        model.addAttribute("todo", toDoRepository.findOne(id));
        model.addAttribute("todoindex", id);
        return "edit";
    }


    @PostMapping(value = "/editToDo")
    public String editToDo(@ModelAttribute ToDo toDo){
        toDoRepository.save(toDo);
        return "redirect:/todo/";
    }

}