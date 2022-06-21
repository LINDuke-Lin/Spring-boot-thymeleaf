package com.myproject.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping("home")
    public String getIndex(Model model) {
        model.addAttribute("userName", "Tom");
        model.addAttribute("userAge", 18);
        model.addAttribute("userSex", "boy");

        return "home";
    }
}
