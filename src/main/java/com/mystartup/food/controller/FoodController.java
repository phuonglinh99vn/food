package com.mystartup.food.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodController {
    @GetMapping("/home")
    public String getHome(Model model){
        model.addAttribute("message", "Hello Subscriber");
        return "home";
    }
}
