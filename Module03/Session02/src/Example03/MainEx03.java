package Example03;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainEx03 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();

        String[] names = {"One", "Two", "Three"}; //Name of our Threads

        for(String name: names) {
            pool.execute(new MyRunnablePool(name)); //we create each thread and execute it
        }

        System.out.println("Pool status before shutdown: isShutdown()= " + pool.isShutdown() + ", isTerminated()=" + pool.isTerminated());
        pool.shutdown();//We turn off the pool so that it cannot receive new threads

        //pool.execute(new MyRunnablePool("Four"));// if we try to do this we will receive an exception
        System.out.println("Pool status after shutdown: isShutdown()= " + pool.isShutdown() + ", isTerminated()=" + pool.isTerminated());

        try {
            long timeLimitMs = 100;
            System.out.println("" + timeLimitMs + " ms");

            boolean finished = pool.awaitTermination(timeLimitMs, TimeUnit.MILLISECONDS); //We wait for the threads for 100ms, returns true if they finished before or up to 100ms or false if they were interrupted
            System.out.println("Are our threads over? " + finished);

            if (!finished) {
                System.out.println("Waiting for threads to end in" + timeLimitMs + " ms...");
                List<Runnable> pendings = pool.shutdownNow(); //Finish the threads that are running and returns a list of threads pending execution
                System.out.println(pendings.size() + " pending threads");
                finished = pool.awaitTermination(timeLimitMs, TimeUnit.MILLISECONDS); //waiting another 100ms for our threads to finish

                if(!finished){
                    System.out.println("There are still pending threads");
                }
                System.out.println("Exiting main");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
