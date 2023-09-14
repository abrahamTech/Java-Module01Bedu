package com.abraham.java.backend.Session05;

import com.abraham.java.backend.Session05.c1.services.GreetingServiceC1;
import com.abraham.java.backend.Session05.e1.models.Greeting;
import com.abraham.java.backend.Session05.e2.services.GreetingService;
import com.abraham.java.backend.Session05.e3.services.GreetingServiceE3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Session05Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Session05Application.class, args);
	}

	/*
	// --------------------------------------- E1 ---------------------------------------
	
	/* Form 1
	@Autowired //Do the Injection
	//Change the access level from private to public to assign the instance and then return from public to private
	//Causes slow startup
	private Greeting greeting;*/


	/*
	//Form 2
	private Greeting greeting;

	//Don't change the type of access and the assign
	@Autowired
	//This is the RECOMMENDED way, since it does not change the access level
	//and does not allow modifying the instance
	public Session05Application(Greeting greeting) {
		this.greeting = greeting;
	}
	*/

	/*//Form 3
	private Greeting greeting;

	@Autowired
	//Access level does not change
	//But it allows modifying the instance
	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}
	*/

	/* 
	@Override
	public void run(String... args) throws Exception {
		System.out.println(greeting.getName());
	}
	*/


	// --------------------------------------- E2 ---------------------------------------

	/*private final GreetingService greetingService;

	public Session05Application(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(greetingService.greet());
	}
	*/

	// --------------------------------------- E3 ---------------------------------------
	
	/*private final GreetingServiceE3 greetingServiceE3;
	
	@Autowired
	public Session05Application(GreetingServiceE3 greetingServiceE3) {
		this.greetingServiceE3 = greetingServiceE3;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(greetingServiceE3.greet());
	}
	*/
	
	// --------------------------------------- C1 ---------------------------------------

	private final GreetingServiceC1 greetingServiceC1;

	public Session05Application(@Autowired GreetingServiceC1 greetingServiceC1) {
		this.greetingServiceC1 = greetingServiceC1;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(greetingServiceC1.greet());
	}

}
