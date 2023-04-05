package org.example;

public class Multiply {
    public Multiply(){}
    public int umn(int a, int b) throws NotEvenExceptions {
        if (a%2 != 0 || b%2 != 0){
            throw new NotEvenExceptions("Число нечетное");
        }

        return a*b;
    }

}
