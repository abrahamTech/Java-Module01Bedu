package org.example.Challenge02;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ChainRestaurants02 {
    private Random random = new Random();

    public double getFranchiseProfits(int id){
        try {
            TimeUnit.MILLISECONDS.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return random.nextInt(40000) + 10000;
    }
}
