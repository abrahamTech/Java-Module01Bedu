package com.abraham.java.backend.Session05.e2.models;

import org.springframework.stereotype.Component;

@Component
// With component we tell Spring to manage
// The model instances and inject them where we need them
public class GreetingComponent {

    private final String name;

    public GreetingComponent() {
        this.name = "Beto E2";
    }

    public String getName() {
        return name;
    }
}
