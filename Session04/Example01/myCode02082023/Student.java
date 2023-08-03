package Session04.Example01.myCode02082023;

public class Student {
    private String course;
    private byte session;
    private String objective;

    //Initialization block of our class
    {
        System.out.println("\nI'm alive");
        course = "Java SE II";
        session = 5;
        objective = "Learn java";
    }

    //You can generate two or more Initialization block
    {
        System.out.println("Hello!!");
        course = "Python";
    }

    //Empty Constructor with default values
    public Student() {
        this.session = 4;
        this.objective = "Web programming";
    }

    //Constructor
    public Student(String cour, byte sess, String object) {
        this.course = cour;
        this.session = sess;
        this.objective = object;
    }




    public  String getCourse() {
        return course;
    }

    public byte getSession() {
        return session;
    }

    public String getObjective() {
        return objective;
    }
}
