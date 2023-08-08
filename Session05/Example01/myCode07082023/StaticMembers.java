package Session05.Example01.myCode07082023;

public class StaticMembers {
    //The value is shared with all Instances
    private static short classCounter = 0;

    private short counterInstance = 0;

    public static short getClassCounter() {
        return classCounter;
    }

    public short getCounterInstance() {
        return counterInstance;
    }

    //Constructor
    public StaticMembers() {
        classCounter++;
        counterInstance++;
    }
}
