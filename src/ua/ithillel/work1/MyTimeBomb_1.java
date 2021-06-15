package ua.ithillel.work1;

public class MyTimeBomb_1 extends Thread {
    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println("MyTimeBomb_1: " + i);
        }
        System.out.println("MyTimeBomb_1: Boom!!!\n");
    }
}
