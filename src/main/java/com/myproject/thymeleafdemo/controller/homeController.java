package com.myproject.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // controller tag
public class homeController {

    @GetMapping("home")
    public String getIndex(Model model) {
        model.addAttribute("userName", "Tom");
        model.addAttribute("userAge", 18);
        model.addAttribute("userSex", "boy");

        return "home";
    }

    // Login form
    @GetMapping("/loggin")
    public String login() {
        return "loggin";
    }
}
