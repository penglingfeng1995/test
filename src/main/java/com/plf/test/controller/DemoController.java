package com.plf.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String hello(){
        return "<h1>Hello World!!!</h1>";
    }
}
