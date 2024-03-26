package com.example.gen20javaspringservlet.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HelloWorldController {

    @GetMapping
    public String welcome(Model model){
        String message = "Spring MVC";
        model.addAttribute("msg", message);
        return "index";
    }

}
