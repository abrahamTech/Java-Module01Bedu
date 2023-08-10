package Session06.Example03.myCode09082023;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        //Set is an INTERFACE
        //HashSet is a CLASS that implements List INTERFACE
        Set<String> set01 = new HashSet<>();


        System.out.println("\n-------------\nSET: ");
        //Doesn't respect the order of how the elements are added
        set01.add("one");
        set01.add("two");
        set01.add("three");
        set01.add("three"); //Don't Allow 2 equal elements, only will show 1 three
        set01.add("four");
        set01.add("five");

        for(String s: set01) {
            System.out.println(s);
        }


        System.out.println("\n-------------\nNumber's SET: ");

        Set<Number> setNum01 = new HashSet<>();

        setNum01.add(new Number("one"));
        setNum01.add(new Number("two"));
        setNum01.add(new Number("three"));
        setNum01.add(new Number("three"));
        setNum01.add(new Number("four"));
        setNum01.add(new Number("five"));

        for (Number n : setNum01){
            System.out.println(n.getName());
        }
    }
}
