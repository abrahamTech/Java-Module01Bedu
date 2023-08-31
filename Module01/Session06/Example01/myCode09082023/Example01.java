package Session06.Example01.myCode09082023;

public class Example01 {
    public static void main(String[] args) {

        Deer deer01 = new Deer();
        System.out.println("\nDeer Polymorphism");
        System.out.println("Instance of Deer: " + (deer01 instanceof Deer));
        System.out.println("Instance of Herbivorous: " + (deer01 instanceof Herbivorous));
        System.out.println("Instance of Animal: " + (deer01 instanceof Animal));
        System.out.println("Instance of Object: " + (deer01 instanceof Object));

        Object obj01 = new Object();
        System.out.println("\nObject Polymorphism");
        System.out.println("Instance of Deer: " + (obj01 instanceof Deer));
        System.out.println("Instance of Herbivorous: " + (obj01 instanceof Herbivorous));
        System.out.println("Instance of Animal: " + (obj01 instanceof Animal));
        System.out.println("Instance of Object: " + (obj01 instanceof Object));


        System.out.println("\nInterface Method Foo: ");

        int fooVal;
        fooVal = deer01.foo(67);

        System.out.println(fooVal);
    }
}
