package Session05.Challenge02.myChallenge07082023;

import java.time.LocalDate;
import java.time.Month;

public class Challenge {
    public static void main(String[] args) {
        
        Programmer prog01 = new Programmer("Thomas", (byte) 25, LocalDate.of(1997, Month.DECEMBER, 12), 15000F, "Python");
        DBA dba01 = new DBA("Arthur", (byte) 35, LocalDate.of(1987, Month.SEPTEMBER, 24), 20000F, "SQL Server");


        System.out.println("\n=======Programmer Data=======");

        System.out.println("Name: " + prog01.getName());
        System.out.println("Age: " + prog01.getAge());
        System.out.println("Birthdate: " + prog01.getBIRTHDATE());
        System.out.println("Salary: " + prog01.getSalary());
        System.out.println("Main Language: " + prog01.getMainLanguage());


        System.out.println("\n=======DBA Data=======");

        System.out.println("Name: " + dba01.getName());
        System.out.println("Age: " + dba01.getAge());
        System.out.println("Birthdate: " + dba01.getBIRTHDATE());
        System.out.println("Salary: " + dba01.getSalary());
        System.out.println("Main Language: " + dba01.getConsultingTool());

    }
}
