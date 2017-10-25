package com.greenfox.bankofsimba.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTMLCeptionController {


    @RequestMapping(value = "/HTMLCeption")
    public String account (Model model) {
        model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");

        return "HTMLCeption";
    }

}
