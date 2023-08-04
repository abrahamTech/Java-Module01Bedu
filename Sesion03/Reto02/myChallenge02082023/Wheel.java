package Sesion03.Reto02.myChallenge02082023;

public class Wheel {


    private float wide;
    private float diameter;
    private float pressure;

    //Constructor
    public Wheel (float wide, float diameter, float pressure) {
        this.wide = wide;
        this.diameter = diameter;
        this.pressure = pressure;
    }

    public float getWide() {
        return wide;
    }

    public void setWide(float wide) {
        this.wide = wide;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }


    public void usingWheel(String style) {
        System.out.println("The " + style + " is moving");
    }
}
