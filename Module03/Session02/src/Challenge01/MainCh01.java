package Challenge01;

public class MainCh01 {
    public static void main(String[] args) {
        MyThread01 th1 = new MyThread01();
        MyThread02 th2 = new MyThread02();
        th2.setDaemon(true);

        th1.start();
        th2.start();
    }
}
