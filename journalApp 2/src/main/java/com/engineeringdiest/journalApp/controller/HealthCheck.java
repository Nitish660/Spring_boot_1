package com.engineeringdiest.journalApp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HealthCheck {

    @GetMapping("/health-check")
    @ResponseBody
    public  String healthCheck(){
        return "OK";
    }
}
