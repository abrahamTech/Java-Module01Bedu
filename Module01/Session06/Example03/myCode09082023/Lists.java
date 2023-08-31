package Session06.Example03.myCode09082023;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        //List is an INTERFACE
        //ArrayList is a CLASS that implements List INTERFACE
        List<String> list01 = new ArrayList<>();

        //Respect the order of how the elements are added
        list01.add("one");
        list01.add("two");
        list01.add("three");
        list01.add("three"); //Allow 2 equal elements
        list01.add("four");
        list01.add("five");

        System.out.println("\nFOR:");
        for(int i = 0; i < list01.size(); i++) {
            System.out.println("For: " + list01.get(i));
        }

        System.out.println("\nFOR EACH");
        for (String s: list01) {
            System.out.println("For Each: " + s);
        }
    }
}
