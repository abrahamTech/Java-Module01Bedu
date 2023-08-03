package Sesion03.Reto02.myChallenge02082023;

public class Fuel {
    private float maxLiters;

    private float currentLiters;

    public Fuel(float maxLit, float currentLit) {
        this.maxLiters = maxLit;
        this.currentLiters = currentLit;
    }

    public float getMaxLiters() {
        return maxLiters;
    }

    public void setMaxLetters(float maxLitters) {
        this.maxLiters = maxLitters;
    }

    public float getCurrentLitters() {
        return currentLiters;
    }

    public void setCurrentLiters(float currentLiters) {
        this.currentLiters = currentLiters;
    }

    public void usingFuel() {
        currentLiters--;

        System.out.println(currentLiters + " liters left");

        if(currentLiters <= 0) {
            System.out.println("Out of fuel, go to the gas station");
        }
    }
}
