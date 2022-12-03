package com.example.springhomepage.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellow {

    @GetMapping("hellow")
    public String sayHellow()
    {
        return "hellow world DaeHui";
    }
}
