package Session10.Example02Interfaces;

public class Plane implements Vehicle{
    @Override
    public void start() {
        System.out.println("Turning on the turbines");
    }

    @Override
    public void transport() {
        System.out.println("I travel on 2 wheels");
    }

    @Override
    public void go() {
        System.out.println("I move in the sky");
    }
}
