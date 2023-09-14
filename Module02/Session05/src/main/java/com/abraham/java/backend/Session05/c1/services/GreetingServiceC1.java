package com.abraham.java.backend.Session05.c1.services;

import com.abraham.java.backend.Session05.c1.models.GreetingComponentC1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceC1 {

    private final GreetingComponentC1 greetingComponent;
    private final GreetingComponentC1 otherGreetingComponent;

    @Autowired
    public GreetingServiceC1(GreetingComponentC1 greetingComponent, GreetingComponentC1 otherGreetingComponent) {
        this.greetingComponent = greetingComponent;
        this.otherGreetingComponent = otherGreetingComponent;

        System.out.println(greetingComponent == otherGreetingComponent);
    }

    public String greet() {
        return "Hello " + greetingComponent.getName();
    }
}
