package org.abrahamtech.java.backend.Session06.e2.controllers;

import org.abrahamtech.java.backend.Session06.e2.models.Address;
import org.abrahamtech.java.backend.Session06.e2.models.UserClassE2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/user")
public class UserControllerE2 {
    @PostMapping
    public ResponseEntity<UserClassE2> createUser(@RequestBody UserClassE2 user) {
        System.out.println("\nCreating user...");
        System.out.println("Name: " + user.getName());
        System.out.println("Lastname: " + user.getLastName());
        System.out.println("User: " + user.getUser());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());

        Address address = new Address();
        address.setStreet("St Monica");
        address.setNumber("456");
        address.setPostalCode("37596");

        user.setAddress(address);

        //return ResponseEntity.ok(user);
        return ResponseEntity.status(HttpStatus.CREATED).eTag("Test").body(user);
    }
}
