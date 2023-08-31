package Session09.myCode21082023;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProg = true;

        Map<String, Double> convRates = new HashMap<>();

        // Define conversion rates (1 source currency unit equals ...)
        convRates.put("MXN", 1.0);         //Mexican peso
        convRates.put("EUR", 1/18.55);     //Euro
        convRates.put("JPY", 1/0.12);      //Japanese yen
        convRates.put("COP", 1/0.0041);    //Colombian peso
        convRates.put("GBP", 1/21.72);     //Pound sterling
        convRates.put("CHF", 1/19.37);     //Swiss franc
        convRates.put("USD", 1/16.99);     //American Dollar

        System.out.println("Welcome to the Currency Converter");


        while(continueProg) {

            System.out.println("\n***********************");
            System.out.println("*Available currencies:*");
            System.out.println("***********************");
            //keySet() -> Returns a Set view of the keys contained in this map.
            for (String currency : convRates.keySet()) {
                System.out.print(" - " + currency);
            }
            System.out.println(" -\n");

            System.out.print("Enter the source currency: ");
            String sourceCurrency = scanner.next().toUpperCase();
            System.out.print("Enter the target currency: ");
            String targetCurrency = scanner.next().toUpperCase();

            if (!convRates.containsKey(sourceCurrency) || !convRates.containsKey(targetCurrency)) {
                System.out.println("Invalid currency. Make sure to use valid 3-letter codes.");
                continue;
            }

            System.out.println("Enter the amount to convert: ");
            double sourceAmount = Double.parseDouble(scanner.next());


            double exchangeRate = convRates.get(targetCurrency) / convRates.get(sourceCurrency);
            double targetAmount = sourceAmount * exchangeRate;


            System.out.printf("%.2f %s is %.2f %s%n", sourceAmount, sourceCurrency, targetAmount, targetCurrency);

            System.out.println("\nDo you want to perform another conversion? (Y/N): ");
            String outYN = scanner.next().toUpperCase();

            if(outYN.equals("N")) {
                System.out.println("Come back soon!!");
                continueProg = false;
            }
        }

        //Close Scanner
        scanner.close();
    }
}
