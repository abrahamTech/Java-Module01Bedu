package Module02.Session06.src.main.java.org.abrahamtech.java.backend.Session06.e1.controllers;

import Module02.Session06.src.main.java.org.abrahamtech.java.backend.Session06.e1.models.UserClass;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user") //All the info is going to be in this route
public class UserController {

    @PostMapping
    public String createUser(@RequestBody UserClass user) {
        System.out.println("\nCreating user...");
        System.out.println("Name: " + user.getName());
        System.out.println("Lastname: " + user.getLastName());
        System.out.println("User: " + user.getUser());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());

        return "User created!";
    }

    @PostMapping("/{id}")
    public String createUser(@RequestBody UserClass user, @PathVariable("id") long id) {
        System.out.println("\nCreating user...");
        System.out.println("Name: " + user.getName());
        System.out.println("Lastname: " + user.getLastName());
        System.out.println("User: " + user.getUser());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());

        return "User " + id + " created!";

    }
}
