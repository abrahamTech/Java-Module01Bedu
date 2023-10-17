package org.example.Challenge01;

import java.util.Random;
import java.util.concurrent.TimeUnit;


public class ChainRestaurants {
    private Random random = new Random();

    public double makeFranchiseProfits(int id){
        try {
            TimeUnit.MILLISECONDS.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return random.nextInt(40000) + 10000;
    }

}
