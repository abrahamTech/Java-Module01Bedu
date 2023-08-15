package Session07.Example02.myCode14082023;

public class Person implements Comparable<Person>{
    private String name;
    private String lastName;
    private float height;

    public Person(String name, String lastName, float height) {
        this.name = name;
        this.lastName = lastName;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public int compareTo(Person p) {
        //Doesn't matter the value, only if it is +, - or 0
        /*if(this.height > p.height){
            return 1;
        } else if(this.height == p.height) {
            return 0;
        } else {
            return -1;
        }*/

        //Receives 2 floats values and return the same as the previous IFs
        return Float.compare(this.height, p.height);
    }
}
