package org.abraham.java.backend.Session07.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerGreeting {

    @GetMapping("/hello")
    public ModelAndView hello(){
        //ModelAndView is a class in Spring MVC that acts as a container for Model and View. Allows a controller to return both the model and the view in a single return value.
        ModelAndView modelAndView = new ModelAndView("hello"); //Needs to be the same NAME as the HTML file that we are going to return
        modelAndView.addObject("message", "Hi from thymeleaf");
        return modelAndView;
    }

    @GetMapping("/helloParam")
    public ModelAndView hello(@RequestParam(name = "message") String message) {
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("message", message);
        return modelAndView;
    }
}
