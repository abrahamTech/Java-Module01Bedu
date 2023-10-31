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
	* http://localhost:8080/cita/
	* In body:
	*{
	   "id": 3,
	   "libro": "Java",
	   "autor": "Andres",
	   "contenido": "Introduccion a JAva III"
	*}
	*
	* - Route GET:
	* http://localhost:8080/cita/1
	 */
}
