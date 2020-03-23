package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/echo")
    public String echo(String target) {
        return target+"this is 2.1";
    }


}
