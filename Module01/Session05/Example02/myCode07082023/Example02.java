package Session05.Example02.myCode07082023;

public class Example02 {
    public static void main(String[] args) {
        Triangle triangle01 = new Triangle(4.5, 2.5, "I");
        System.out.println("\nArea: " + triangle01.getArea());
        //Mother Class Method
        triangle01.showDimension();

        Rectangle rectangle01 = new Rectangle(3.5, 4.2);
        System.out.println("\nArea: " + rectangle01.getArea());
        //Mother Class Method
        rectangle01.showDimension();
    }
}
