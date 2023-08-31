package Session05.Example01.myCode07082023;

public class Example01 {
    public static void main(String[] args) {
        //It is created even though an instance doesn't create
        System.out.println("\nBefore Initialize Instances: " + StaticMembers.getClassCounter());

        //Instance 1
        StaticMembers m1 = new StaticMembers();
        System.out.println("\nM1's class counter: " + m1.getClassCounter());
        System.out.println("M1's instance counter: " + m1.getCounterInstance());

        //Instance 2
        StaticMembers m2 = new StaticMembers();
        System.out.println("\nM2's class counter: " + m2.getClassCounter());
        System.out.println("M2's instance counter: " + m2.getCounterInstance());

        //Instance 3
        StaticMembers m3 = new StaticMembers();
        System.out.println("\nM3's class counter: " + m3.getClassCounter());
        //You can also call with the Class Name
        System.out.println("M3's class counter: " + StaticMembers.getClassCounter());
        System.out.println("M3's instance counter: " + m3.getCounterInstance());
    }
}
