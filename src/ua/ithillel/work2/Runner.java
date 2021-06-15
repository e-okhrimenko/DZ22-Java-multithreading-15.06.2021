package ua.ithillel.work2;

import java.util.Random;

public class Runner {
    private int[] createIntArray() {
        int[] myArray = new int[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            myArray[i] = random.nextInt(1001);
        }
        return myArray;
    }

    public void run() throws InterruptedException {
        MySumCount_1 mySumCount_1 = new MySumCount_1(0, 99, createIntArray());
        mySumCount_1.start();
        mySumCount_1.join();
        System.out.println("mySumCount_1: " + mySumCount_1.getResultSum());

        MySumCount_2 mySumCount_2 = new MySumCount_2(0, 99, createIntArray());
        Thread thread = new Thread(mySumCount_2);
        thread.start();
        thread.join();
        System.out.println("mySumCount_2: " + mySumCount_2.getResultSum());
    }
}
