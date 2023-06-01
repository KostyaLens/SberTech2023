package org.example;

public class Main {
    public static void main(String[] args) {
        Philosopher[] philosophers = new Philosopher[5];
        Fоrk[] fоrks = new Fоrk[5];
        for (Fоrk fоrk: fоrks ){
            fоrk.taken = false;
        }
        for (int i = 0; i < philosophers.length; i++) {
            Philosopher philosopher = new Philosopher(fоrks[i], fоrks[(i + 1) % 5]);
        }
        Thread thread0 = new Thread(philosophers[0], "Плутон");
        Thread thread1 = new Thread(philosophers[1], "Аристотель");
        Thread thread2 = new Thread(philosophers[2], "Оботуров");
        Thread thread3 = new Thread(philosophers[3], "укуренный Олежа");
        Thread thread4 = new Thread(philosophers[4], "пьяный Игорь");
        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }


}