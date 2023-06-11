package com.example.demo24.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {

    @GetMapping("/")
    public String helloworld(){
        return "welcome to daily code buffer !!! Avadhut";
    }
}
