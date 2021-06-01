package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/1/hello")
    public String getMessage() { 
        return "hello world";
    }
    
    @GetMapping("/1/hilo")
    public String getGreetings() { 
        return "Namaste";
    }
}
