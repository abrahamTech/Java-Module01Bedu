package org.abrahamtech.Session01.config;

import java.util.Scanner;

import org.abrahamtech.Session01.util.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //From this Class Spring is going to take configurations
public class CalculatorConfig {
    
    @Bean //They are instances of classes that we can occupy anywhere in the application (BEAN notation is only about methods)
    public Calculator createCalculator() { // Will return an instance of the Calculator
        return new Calculator();
    }

    @Bean
    public Scanner createScanner() { // Will return an instance of the Scanner 
        return new Scanner(System.in);
    }
}
