package com.cafaro.study2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Get {

    @GetMapping("/")
    public  String ping(){
        return new Date().toString();
    }
}
