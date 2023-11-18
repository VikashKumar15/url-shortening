package com.system.design.urlshrotening.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(path = "/test")
    public String testEndpiont(){
        return "success";
    }
}
