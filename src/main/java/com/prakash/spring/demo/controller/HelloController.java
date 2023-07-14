package com.prakash.spring.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String get(){
        System.out.println("Hello World !!!");
        return "Hello, Welcome to First Hello World Program";
    }
}
