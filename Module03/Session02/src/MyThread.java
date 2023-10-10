import java.util.concurrent.TimeUnit;

public class MyThread extends Thread{
    String parameter;

    public MyThread(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public void run () {
        while (!parameter.equals("Finish")) {
            showInfo();
            pause();
        }
        showInfo();
    }

    //Modify the parameter value
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    private void showInfo() {
        String threadType = isDaemon() ? "Daemon" : "User";

        System.out.println(threadType + "\t| Name: " + getName() + "\t| " + getId() + "\t| Parameter: " + parameter);
    }

    public static void pause() {
        try{
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
