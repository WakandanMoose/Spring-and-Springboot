package com.ruchira.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller
// @Controller - is used for ??
@RestController
public class HomeController {

    @RequestMapping("/")  // '/' refers to the home page of localhost:8080
    // @ResponseBody
    // @ResponseBody -  used to display the content on the web
    public String greet() {
        return "Welcome to Spring Boot.";
    }

    @RequestMapping("/about")
    public String about() {
        return "About Page";
    }
}
