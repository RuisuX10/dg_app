package com.dg_app.dg_app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class testController {

    @GetMapping("/test")
    public String getMethodName() {
        return "app funcionando correctamente";
    }
    
}
