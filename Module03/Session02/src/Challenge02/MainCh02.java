package Challenge02;

public class MainCh02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread01Ch02());
        Thread t2 = new Thread(new MyThread02Ch02());
        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
