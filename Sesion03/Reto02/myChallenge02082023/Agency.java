package Sesion03.Reto02.myChallenge02082023;

import java.util.Scanner;

import org.bedu.java.jse.basico.sesion3.reto2.Vehiculo;

public class Agency {

        Scanner scanner = new Scanner(System.in);

        int option;

        Car vehicle = new Car();
        Fuel fuel = new Fuel(50, 40);
        
        System.out.println("========================");

        System.out.println("Enter an option: ");
        option = scanner.nextInt();

        switch (option) {
            case 1:
                for (int i = 1; i<= 20; i++) {

                    vehicle.driving();

                    if(vehicle.fuel.getCurrentLitters() <= 0) {
                        break;
                    }
                }

                break;

            case 2: 
                
                vehicle.getFuelStation();
                System.out.println("Full fuel tank");
                
                break;
            
            case 3: 

                System.out.println("Getting out of the vehicle");
                break;

            default:
                break;
        }

}
