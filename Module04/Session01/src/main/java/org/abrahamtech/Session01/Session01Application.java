package org.abrahamtech.Session01;

import java.util.Scanner;

import org.abrahamtech.Session01.util.Calculator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Session01Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Session01Application.class, args);
	}

	//You can use "@Override" with the Interface "CommandLineRunner"
	/*@Override
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
		
	}*/

	@Override
	public void run(String... args){
		Scanner sc = new Scanner(System.in);

		System.out.println("***********************");
		System.out.println("*Select the operation:*");
		System.out.println("***********************");
		System.out.println("1.- Add");
		System.out.println("2.- Substract");
		System.out.println("3.- Multiply");
		System.out.println("4.- Divide");
		System.out.println("************************");

		System.out.println(">>");

		int option = sc.nextInt();
		sc.nextLine();

		if(option < 1 || option > 4) {
			System.out.println("Don't exist the operation...");
			return;
		}

		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		sc.nextLine();

		int result = 0;

		Calculator calculator = new Calculator();

		switch (option) {
			case 1:
				result = calculator.add(a, b);
				break;

			case 2:
				result = calculator.subs(a, b);
				break;

			case 3:
				result = calculator.mult(a, b);
				break;

			case 4:
				result = calculator.div(a, b);
				break;
		
			default:
				break;
		}

		System.out.println("Result: " + result);
	}

}
