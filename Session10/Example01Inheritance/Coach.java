package Session10.Example01Inheritance;

public class Coach extends Employee{
    /*private int id;
    private String name;
    private String lastName;
    private int age;*/
    private int idFederation;

    public void leadGame() {
        System.out.println("I'm playing");
    }

    public void leadTraining() {
        System.out.println("I'm training");
    }

    /*public void travel() {
        System.out.println("I'm traveling");
    }*/
}
