package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/*
	* - Route POST:
	* http://localhost:8080/casa/
	* In body:
	*{
  		"id": 1,
  		"jefeDeFamilia": "Andrés",
  		"otros": [
   		"Isaac"
    	]
	*}
	*
	* - Route GET:
	* http://localhost:8080/casa/1
	* */
}
