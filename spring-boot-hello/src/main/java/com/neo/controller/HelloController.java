package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        System.out.println("--------测试---------");
        return "Hello Spring Boot 2.0!";
    }
}