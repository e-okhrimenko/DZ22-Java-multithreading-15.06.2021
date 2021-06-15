package ua.ithillel.work1;

public class Runner {
    public void run() {
        MyTimeBomb_1 myTimeBomb_1 = new MyTimeBomb_1();
        myTimeBomb_1.start();

        MyTimeBomb_2 myTimeBomb_2 = new MyTimeBomb_2();
        new Thread(myTimeBomb_2).start();
    }
}
