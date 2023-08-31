package Sesion03.Reto02.myChallenge02082023;

import java.util.Scanner;

public class Agency {

    static Wheel wheel1, wheel2, wheel3, wheel4;
    static Fuel fuel;
    static Car car;

    public static void main(String[] args) {

        wheel1 = new Wheel(200, 20, 30);
        wheel2 = new Wheel(200, 20, 30);
        wheel3 = new Wheel(200, 20, 30);
        wheel4 = new Wheel(200, 20, 30);

        fuel = new Fuel(50, 15);
        car = new Car("BMW");

        car.setFuel(fuel);
        car.putTire(wheel1, wheel2, wheel3, wheel4);

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n\n***************Menu***************");
            System.out.println("1.- Move");
            System.out.println("2.- Stopped at the gas station");
            System.out.println("3.- Get out of the vehicle");
            System.out.println("**********************************");

            System.out.println("Enter an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    for (int i = 1; i <= 20; i++) {

                        car.driving();

                        if (car.fuel.getCurrentLitters() <= 0) {
                            break;
                        }
                    }

                    break;

                case 2:

                    car.getFuelStation();
                    System.out.println("\n\n----------------");
                    System.out.println("|Full fuel tank|");
                    System.out.println("----------------");

                    break;

                case 3:

                    System.out.println("\n\n------------------------");
                    System.out.println("|Getting out of the car|");
                    System.out.println("------------------------");
                    break;

                default:
                    break;
            }

        } while (option != 3);

    }

}
