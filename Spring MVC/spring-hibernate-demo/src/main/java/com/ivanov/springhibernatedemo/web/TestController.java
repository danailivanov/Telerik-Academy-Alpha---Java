package com.ivanov.springhibernatedemo.web;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    private SessionFactory factory;

    @Autowired
    public TestController(SessionFactory factory) {
        this.factory = factory;
    }

    @GetMapping
    public String test(){
        return "Fuck you!!!";
    }
}
