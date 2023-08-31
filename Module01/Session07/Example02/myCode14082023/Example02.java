package Session07.Example02.myCode14082023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example02 {
    public static void main(String[] args) {
        Person anne = new Person("Anne", "Hathaway", 1.62F);
        Person arthur = new Person("Arthur", "Molina", 1.7F);
        Person caroline = new Person("Caroline", "Scott", 1.61F);

        List<Person> personList = new ArrayList<>();

        personList.add(anne);
        personList.add(arthur);
        personList.add(caroline);

        //Order the Structure with the CompareTo method and the priority in there
        Collections.sort(personList);

        for (Person p: personList) {
            System.out.println(p.getName() + " " + p.getHeight());
        }
    }
}
