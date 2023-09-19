package org.abrahamtech.java.backend.Session06.c1.controllers;

import org.abrahamtech.java.backend.Session06.c1.models.UserClassC1;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/c1/user") //All the info is going to be in this route
public class UserControllerC1 {

    @PostMapping
    public String createUser(@RequestBody UserClassC1 user) {
        System.out.println("\nCreating user...");
        System.out.println("Name: " + user.getName());
        System.out.println("Lastname: " + user.getLastName());
        System.out.println("User: " + user.getUser());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());

        return "User created!";
    }

    @PostMapping("/{id}")
    public String createUser(@RequestBody UserClassC1 user, @PathVariable("id") long id) {
        System.out.println("\nCreating user...");
        System.out.println("Name: " + user.getName());
        System.out.println("Lastname: " + user.getLastName());
        System.out.println("User: " + user.getUser());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());

        return "User " + id + " created!";

    }

    @GetMapping
    public String createUserR1(@RequestBody UserClassC1 user, @RequestParam("id") long id, @RequestParam("rol") String rol) {
        System.out.println("\nCreating user...");
        System.out.println("Name: " + user.getName());
        System.out.println("Lastname: " + user.getLastName());
        System.out.println("User: " + user.getUser());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Rol: " + rol);

        return "User " + id + " created!";

    }

}
