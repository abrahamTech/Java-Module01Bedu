// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //USER Thread
        MyThread thread1 = new MyThread("One");
        thread1.start();

        //DAEMON Thread
        MyThread thread2 = new MyThread("Two");
        thread2.setDaemon(true);
        thread2.start();

        MyThread.pause();
        thread1.setParameter("Finish");

        System.out.println("-------------------------");
        System.out.println("End of Main thread");
        System.out.println("-------------------------");
    }
}