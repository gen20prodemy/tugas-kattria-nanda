package com.example.gen20javaspringframework.Controller;

import com.example.gen20javaspringframework.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ProductController {

    @Autowired
    public ProductService productService;

        @GetMapping
        public String welcome(Model model){
            String message = "Spring MVC";
            model.addAttribute("msg", message);
            model.addAttribute("products", productService.findAll());
            return "produk";
        }
}
