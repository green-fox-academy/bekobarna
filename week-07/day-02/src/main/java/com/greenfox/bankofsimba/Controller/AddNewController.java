package com.greenfox.bankofsimba.Controller;


import com.greenfox.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddNewController {


    @GetMapping("/Add")
    public String greetingForm(Model model) {
        model.addAttribute("addNew", new BankAccount());
        return "Add";
    }

    @PostMapping("/Result")
    public String greetingSubmit(@ModelAttribute BankAccount addNew) {
        return "result";
    }
}
