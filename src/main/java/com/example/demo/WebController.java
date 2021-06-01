package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/2/hello")
    public String getMessage() { 
        return "hello world";
    }
    
    @GetMapping("/2/hilo")
    public String getGreetings() { 
        return "Namaste";
    }
}
