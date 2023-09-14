package com.abraham.java.backend.Session05.e3.services;

import com.abraham.java.backend.Session05.e3.models.GreetingE3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class GreetingServiceE3 {

    private final GreetingE3 greetingE3;

    @Autowired
    public GreetingServiceE3(GreetingE3 greetingE3) {
        this.greetingE3 = greetingE3;
    }

    @PostConstruct
    public  void init () {
        greetingE3.setName("Beto E3");
    }

    public String greet() {
        return "Hello " + greetingE3.getName();
    }
}
