package org.example;

public class Philosopher implements Runnable {
    private Object leftFork;
    private Object rightFork;
    public Philosopher(Object leftFork, Object rightFork){
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName() + " размышляет");
            synchronized(leftFork) {
                System.out.println(Thread.currentThread().getName() + " взял левую вилку");
                synchronized(rightFork) {
                    System.out.println(Thread.currentThread().getName() + " взял правую вилку и начинает кушать");
                    System.out.println(Thread.currentThread().getName() + " положил правую вилку");
                }
                System.out.println(Thread.currentThread().getName() + " положил левую вилку и начинает размышлять");
            }
        }
    }
}
