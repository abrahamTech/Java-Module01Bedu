package Session05.Challenge02.myChallenge07082023;

import java.time.LocalDate;

public class DBA extends Employee {
    private String consultingTool;

    public DBA(String name, byte age, LocalDate birthdate, float salary, String consultingTool) {
        super(name, age, birthdate, salary);
        this.consultingTool = consultingTool;
    }

    public String getConsultingTool() {
        return consultingTool;
    }

    public void setConsultingTool(String consultingTool) {
        this.consultingTool = consultingTool;
    }
}
