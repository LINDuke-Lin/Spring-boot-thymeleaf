package com.myproject.thymeleafdemo.controller.webapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/errorProportion")
public class errorProportionApiController {

    @GetMapping("/getError")
    public String getError() {
        return "api test";
    }
}
