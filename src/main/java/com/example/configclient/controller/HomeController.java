package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${my.greeting:my default text}")
    private String msg;

    @GetMapping("/home")
    public String myhome(){
        return "Hello"+msg;
    }

}
