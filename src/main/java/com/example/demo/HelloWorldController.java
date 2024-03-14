package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String execute () {
        return "Hello world!";
    }
}
