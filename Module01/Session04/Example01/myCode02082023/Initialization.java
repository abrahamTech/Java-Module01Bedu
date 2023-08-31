package Session04.Example01.myCode02082023;

public class Initialization {
    public static void main(String[] args) {
        
        Student student01 = new Student();
        System.out.println(student01.getCourse());
        System.out.println(student01.getSession());

        byte num = 1;

        Student student02 = new Student("JavaScript", num, "Learn JavaScript");
        System.out.println(student02.getCourse());
        System.out.println(student02.getSession());

        Student student03 = new Student();
        System.out.println(student03.getCourse());
        System.out.println(student03.getSession());
    }
    
}