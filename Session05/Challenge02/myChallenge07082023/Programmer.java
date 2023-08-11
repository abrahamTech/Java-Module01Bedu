package Session05.Challenge02.myChallenge07082023;

import java.time.LocalDate;

public class Programmer extends Employee {
    
    private String mainLanguage;

    public Programmer(String name, byte age, LocalDate birthdate, float salary, String mainLanguage) {
        super(name, age, birthdate, salary);
        this.mainLanguage = mainLanguage;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public void setMainLanguage(String mainLanguage) {
        this.mainLanguage = mainLanguage;
    }
}
