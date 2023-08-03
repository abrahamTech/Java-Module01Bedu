package Sesion03.Reto02.myChallenge02082023;

public class Car {

    Fuel fuel = new Fuel(0, 0);
    Wheel wheel = new Wheel();
    

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public void getFuelStation() {
        fuel.setCurrentLiters(fuel.getMaxLiters());
    }

    public void driving () {
        final String NO_Fuel_Message = "Empty tank, go to the gas station";

        if(fuel.getCurrentLitters()>0) {
            for(Wheel wheel : tires) {
                wheel.usingTire(getStyle());
            }
            fuel.usingFuel();
        } else {
            System.out.println(NO_Fuel_Message);
        }
    }
}
