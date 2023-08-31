package Session04.Challenge01.myChallenge02082023;

public class Initialization02 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2);
        Rectangle rectangle3 = new Rectangle(5,4);

        System.out.println("Rectangle 1 Area: " + rectangle1.calcArea());
        System.out.println("Rectangle 2 Area: " + rectangle2.calcArea());
        System.out.println("Rectangle 3 Area: " + rectangle3.calcArea());
    }
}
