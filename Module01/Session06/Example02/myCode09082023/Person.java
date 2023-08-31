package Session06.Example02.myCode09082023;

public class Person {
    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void showInfo(){
        System.out.println("Person: (name: " + name + " last name: " + lastName + ")");
    }

}
