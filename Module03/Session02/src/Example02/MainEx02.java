package Example02;

public class MainEx02 {
    public static void main(String[] args) {

        MyRunnable runnable1 = new MyRunnable("One");
        MyRunnable runnable2 = new MyRunnable("Two");

        Thread t1 = new Thread(runnable1);
        t1.start();

        Thread t2 = new Thread(runnable2);
        t2.setDaemon(true);
        t2.start();

        MyRunnable.pause();
        runnable1.setParameter("Finish");
        System.out.println("----------------------------------");
        System.out.println("End of main thread");
        System.out.println("----------------------------------");
    }
}
