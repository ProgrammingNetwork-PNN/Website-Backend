package com.mysite.sbb.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class test {
    @RequestMapping()
    public String gettest(){
        return "Hello World";
    }
}
