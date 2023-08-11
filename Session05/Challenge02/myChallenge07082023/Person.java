package Session05.Challenge02.myChallenge07082023;

import java.time.LocalDate;

public class Person {
    private String name;
    private byte age;
    private final LocalDate BIRTHDATE;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public LocalDate getBIRTHDATE() {
        return BIRTHDATE;
    }

    public Person(String name, byte age, LocalDate birthdate) {
        this.name = name;
        this.age = age;
        BIRTHDATE = birthdate;
    }
}
