package Session10.Example02Interfaces;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Starting the engine");
    }

    @Override
    public void transport() {
        System.out.println("I travel on 4 wheels");
    }

    @Override
    public void go() {
        System.out.println("I move on the highway");
    }
}
