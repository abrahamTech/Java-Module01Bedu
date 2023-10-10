package Challenge01;

import java.util.concurrent.TimeUnit;

public class MyThread02 extends Thread {
    @Override
    public void run() {
        while(true){
            System.out.println("|Thread2: Still running...");
            try {
                TimeUnit.MILLISECONDS.sleep(500);
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
