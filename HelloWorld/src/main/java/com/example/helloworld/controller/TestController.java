package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/helloworld")
    public String Hello() {
        return "Spring Boot ! Hello World ~";
    }
}