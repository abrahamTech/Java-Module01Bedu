package com.abraham.java.backend.Session05.c1.models;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//The value above is to cancel the "singleton" when obtaining instances
public class GreetingComponentC1 {

    private final String name;

    public GreetingComponentC1() {
        this.name = "Beto C1";

        System.out.println("Creating a Greeting Instance");
    }

    public String getName() {
        return name;
    }
}
