package Example03;

import java.util.concurrent.TimeUnit;

public class MyRunnablePool implements Runnable{
    private String name;

    public MyRunnablePool(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try{
            while (true){
                System.out.println(name + " is running");
                TimeUnit.SECONDS.sleep(2);
            }
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println(name + " was interrupted!!!");
            System.out.println(name + " inInterrupted=" + Thread.currentThread().isInterrupted());
        }

    }
}
