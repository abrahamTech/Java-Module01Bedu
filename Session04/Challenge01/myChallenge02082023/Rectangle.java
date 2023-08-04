package Session04.Challenge01.myChallenge02082023;

public class Rectangle {
    private double height;
    private double weight;

    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public Rectangle(double sides) {
        this(sides, sides);
    }

    public Rectangle() {
        this(0);
    }

    public double calcArea() {
        return height * weight;
    }
}
