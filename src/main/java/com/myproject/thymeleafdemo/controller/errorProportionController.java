package com.myproject.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class errorProportionController {

    @GetMapping("/errorProportion/view")
    public String getIndex() {
        return "errorProportion";
    }
}
