package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/one/hello")
    public String getMessage() { 
        return "hello world";
    }
    
    @GetMapping("/one/hilo")
    public String getGreetings() { 
        return "Namaste";
    }
}
