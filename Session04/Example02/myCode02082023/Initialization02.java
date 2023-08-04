package Session04.Example02.myCode02082023;

public class Initialization02 {
    public static void main(String[] args) {
        Car car01 = new Car("Ford", "Shelby", 1965, 50000);
        Car car02 = new Car("Bugatti", "Veyron", 2009, 2000);

        //HashCode is like an unique int ID
        System.out.println("Ford".hashCode());
        System.out.println("Shelby".hashCode());

        //Verify the override of the hashCode -> adding the 4 parameters
        System.out.println("\nFinal HashCode: " + car01.hashCode());        

        System.out.println("\nIt's equal car01 and car02 hashCodes: " + car01.equals(car02));
    }
}
