package com.Test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test_controller {

    @GetMapping("/test")
    public String display(){
        return "Test Application Running";
    }
}
