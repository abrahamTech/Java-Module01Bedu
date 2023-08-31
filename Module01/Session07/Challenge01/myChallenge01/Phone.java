package Session07.Challenge01.myChallenge01;

public class Phone implements Comparable<Phone>{
    private final String number;
    private final int priority;

    public Phone(String number, int priority) {
        this.number = number;
        this.priority = priority;
    }

    public String getNumber() {
        return number;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Phone p) {
        return this.priority - p.priority;
    }
}
