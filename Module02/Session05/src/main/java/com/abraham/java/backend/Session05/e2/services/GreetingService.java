package com.abraham.java.backend.Session05.e2.services;

import com.abraham.java.backend.Session05.e2.models.GreetingComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final GreetingComponent greetingComponent;

    @Autowired
    public GreetingService(GreetingComponent greetingComponent) {
        this.greetingComponent = greetingComponent;
    }

    public String greet() {
        return "Hello " + greetingComponent.getName();
    }
}
