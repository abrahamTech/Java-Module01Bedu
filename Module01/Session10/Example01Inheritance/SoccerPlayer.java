package Session10.Example01Inheritance;

public class SoccerPlayer extends Employee{
    
    /*private int id;
    private String name;
    private String lastName;
    private int age;*/

    private String position;
    private double salary;

    public void play() {
        System.out.println("I'm playing");
    }

    public void train() {
        System.out.println("I'm training");
    }

    /*public void travel() {
        System.out.println("I'm traveling");
    }*/

}
