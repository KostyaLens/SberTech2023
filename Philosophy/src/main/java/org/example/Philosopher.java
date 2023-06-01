package org.example;

import java.util.concurrent.locks.Lock;

public class Philosopher {
    private Object leftFork;
    private Object rightFork;
    public Philosopher(Object leftFork, Object rightFork){
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }
}

public 