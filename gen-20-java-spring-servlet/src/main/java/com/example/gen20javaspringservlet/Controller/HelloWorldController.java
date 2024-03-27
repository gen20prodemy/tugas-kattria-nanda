package com.example.gen20javaspringservlet.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class HelloWorldController {

    @GetMapping
    public String welcome(Model model){
        String message = "Kita Belajar Spring MVC";
        model.addAttribute("msg", message);
        return "index";
    }

    @GetMapping("/hello")
    public  String withParam(
            @RequestParam(name = "name", required = false, defaultValue =" ") String name, Model model){
        model.addAttribute("msg",name);
        return "index";
    }

}
