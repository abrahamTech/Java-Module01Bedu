package org.abraham.java.backend.Session07.controllers;

import org.abraham.java.backend.Session07.models.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerUser {

    @GetMapping({"/", "/index"})
    public String registerForm(Model model) {
        model.addAttribute("user", new Users());
        return "index";
    }

    @PostMapping("/register")
    public ModelAndView register(Users user) {
        ModelAndView modelAndView = new ModelAndView("successRegister");
        modelAndView.addObject("user", user);
        return modelAndView;
    }
    ///http://localhost:8080/helloParam?message=Hellooooo
}
