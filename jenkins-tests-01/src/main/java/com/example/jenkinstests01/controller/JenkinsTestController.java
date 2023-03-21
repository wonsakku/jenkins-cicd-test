package com.example.jenkinstests01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JenkinsTestController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

}
