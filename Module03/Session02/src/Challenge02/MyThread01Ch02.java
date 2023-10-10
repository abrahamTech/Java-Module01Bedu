package Challenge02;

import java.util.concurrent.TimeUnit;

public class MyThread01Ch02 implements Runnable{

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("|Thread1: " + i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //pause();
        }
    }

    /*public static void pause() {
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/
}
