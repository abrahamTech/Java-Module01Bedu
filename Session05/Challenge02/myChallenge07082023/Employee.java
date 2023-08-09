package Session05.Challenge02.myChallenge07082023;

import java.time.LocalDate;

public class Employee extends Person {
    private float salary;

    public Employee(String name, byte age, LocalDate birthdate, float salary) {
        super(name, age, birthdate);
        this.salary = salary;
    }
}
