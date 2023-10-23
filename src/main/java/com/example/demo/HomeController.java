package com.example.demo;


import lombok.Data;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;

@ControllerAdvice
public class HomeController {
    @GetMapping("/")
    public String f1(){
        return "index";
    }


}