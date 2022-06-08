package com.ccognitio.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resource {

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }
    
}
