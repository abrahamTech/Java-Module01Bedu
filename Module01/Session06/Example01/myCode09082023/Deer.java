package Session06.Example01.myCode09082023;

public class Deer extends Animal implements Herbivorous {
    //We can have all the implements that we want

    //We add the implementation of foo method from the Herbivorous instance
    @Override
    public int foo(int x) {
        return x;
    }

    //We need to complete the abstract method that we create in Animal abstract class
    @Override
    public boolean zoo(int y) {
        return y >= 0;
    }

}
