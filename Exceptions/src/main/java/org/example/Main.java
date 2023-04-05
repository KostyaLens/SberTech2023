package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 2, b = 4;
        Multiply multiply = new Multiply();
        try {
            System.out.println(multiply.umn(a, b));
        } catch (NotEvenExceptions e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Классная сегодня погода");
        }
    }
}