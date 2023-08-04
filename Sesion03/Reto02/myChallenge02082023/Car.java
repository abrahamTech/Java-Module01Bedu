package Sesion03.Reto02.myChallenge02082023;

public class Car {

    private final String style;
    public Fuel fuel;
    private final Wheel[] wheels = new Wheel[4];

    public Car(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void putTire(Wheel frontRight, Wheel frontLeft, Wheel backRight, Wheel backLeft) {
        wheels[0] = frontRight;
        wheels[1] = frontLeft;
        wheels[2] = backRight;
        wheels[3] = backLeft;
    }
    

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public void getFuelStation() {
        fuel.setCurrentLiters(fuel.getMaxLiters());
    }

    public void driving () {
        final String NO_Fuel_Message = "\n\nEmpty tank, go to the gas station\n\n";

        if(fuel.getCurrentLitters()>0) {
            for(Wheel wheel : wheels) {
                wheel.usingWheel(getStyle());
            }
            fuel.usingFuel();
        } else {
            System.out.println(NO_Fuel_Message);
        }
    }
}
