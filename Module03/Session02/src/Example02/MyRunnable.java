package Example02;

import java.util.concurrent.TimeUnit;

public class MyRunnable implements Runnable{
    private String parameter="", name;

    public MyRunnable(String name) {
        this.name = name;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public void run() {
        while (!parameter.equals("Finish")){
            showInfo();
            pause();
        }
        showInfo();
    }

    private void showInfo() {
        System.out.println("\t| Thread: " + name + "\t| Parameter: " + parameter);
    }

    public static void pause() {
        try{
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
