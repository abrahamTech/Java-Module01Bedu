package Session04.Example02.myCode02082023;

public class Car {
    private String brand;
    private String model;
    private int yearProduction;
    private int mileage;

    public Car(String brand, String model, int yearProduction, int mileage) {
        this.brand = brand;
        this.model = model;
        this.yearProduction = yearProduction;
        this.mileage = mileage;
    }

    //Anotation for Override hashCode for "Car" class
    @Override
    public int hashCode() {
        int hash = 0;

        //All the classes have "hashCode" method (In this case "brand" and "model" is String class)
        hash = brand.hashCode();
        hash = hash + model.hashCode();

        hash += yearProduction;
        hash += mileage;

        return hash;
    }
}
