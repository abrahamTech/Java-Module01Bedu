package org.abrahamtech.Session01;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Session01Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Session01Application.class, args);
	}

	//You can use "@Override" with the Interface "CommandLineRunner"
	@Override
	public void run(String... args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		sc.nextLine();

		int result = a + b;

		System.out.println("Result: " + result);
		sc.close();
		
	}

}
