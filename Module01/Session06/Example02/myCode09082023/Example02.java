package Session06.Example02.myCode09082023;

public class Example02 {
    public static void main(String[] args) {
        Person teacher00 = new Person("Gerry", "Saints");
        Teacher teacher01 = new Teacher("John", "Patt", "341235");
        Teacher teacher02 = new ActingTeacher("Chris", "Wilson", "125428", "Friday");
        //Object teacher03 = new ActingTeacher("Phillip", "Pitt", "54723296", "Saturday");

        System.out.println("\nTeacher 00 Info: ");
        teacher00.showInfo();

        System.out.println("\nTeacher 01 Info: ");
        teacher01.showInfo();

        System.out.println("\nTeacher 02 Info: ");
        teacher02.showInfo();

        //Don't work
        //System.out.println("\nTeacher 03 Info: ");
        //teacher03.showInfo();
    }
}
