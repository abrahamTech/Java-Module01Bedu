package Session10.Example02Interfaces;

public interface Vehicle {
    public float speed = 0;

    public void start();
    public void transport();
    public void go();

    //Implementation by default
    default  void horn() {
        System.out.println("Sounding the horn");
    }
}
