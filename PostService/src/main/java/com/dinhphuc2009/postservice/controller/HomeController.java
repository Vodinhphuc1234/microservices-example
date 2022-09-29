package com.dinhphuc2009.postservice.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @Value("${server.port}")
    private int serverPort;
    @GetMapping("home")
    public String getHome () {
        return "Hey from "+serverPort;
    }
}
