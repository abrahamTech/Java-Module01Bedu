package com.abraham.java.backend.Session05.e3.models;

import org.springframework.stereotype.Component;

@Component
public class GreetingE3 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
