package org.example;

public class Task1 {
    public static void main(String[] args) {
        evaluate(0, n -> n % 13 == 0);
        evaluate(10, n -> n % 13 == 0);
        evaluate(13, n -> n % 13 == 0);
        evaluate(169, n -> n % 13 == 0);
        evaluate(164, n -> n % 13 == 0);
        evaluate(28561, n -> n % 13 == 0);
    }
    public static void evaluate(int n, IntToBool<Integer> predicate) {
        System.out.print(n + " ");
        System.out.println(predicate.applyAsBool(n));
    }
}
