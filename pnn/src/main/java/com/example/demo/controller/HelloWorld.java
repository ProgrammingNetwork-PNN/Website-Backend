package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/helloWorld")
@RestController
public class HelloWorld {
    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")
    public String getReqString(){
        return "Hello World";
    }
}
