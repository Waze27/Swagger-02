package com.Swagger02.Swagger02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping
    public String root(){
        return "Welcome to localhost:5050";
    }
}


