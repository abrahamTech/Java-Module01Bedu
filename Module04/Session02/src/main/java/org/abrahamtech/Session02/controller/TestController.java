package org.abrahamtech.Session02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //We indicate that ir is a Controller
public class TestController {
    
    @RequestMapping("/hello") //Method that will be executed when you enter the following URL
    public String helloWorld() {
        return "Hello World!";
    }

    @RequestMapping("/goodbye") //Method that will be executed when you enter the following URL
    public String goodBye() {
        return "Good Bye!";
    }

    @RequestMapping("/html") //Method that will be executed when you enter the following URL
    public String html() {
        return "<h1>This is an h1 in HTML</h1>";
    }
}
