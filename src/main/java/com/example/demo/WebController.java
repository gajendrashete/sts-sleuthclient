package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping
    public String getMessage() { 
        return "hello world";
    }
    
    @GetMapping
    public String getGreetings() { 
        return "Namaste";
    }
}
