package com.abraham.java.backend.Session05.e1.config;

import com.abraham.java.backend.Session05.e1.models.Greeting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Indicate that you are going to manage dependencies within this class
public class GreetingConfig {

    @Bean //Bean -> so they can be injected
    public Greeting saludo(){
        return new Greeting("Beto");
    }

}
