package org.example;

public class Task3 {
    public static void main(String[] args) {
        decision(1.4, 100.4, 4.0, (a, b, c) -> (b * b) - (4 * a * c));
        decision(10.0, 1.2, 2.0, (a, b, c) -> (b * b) - (4 * a * c));
    }
    public static void decision(Double a, Double b, Double c, ToFloatBiFunction<Double> predicate) {
        System.out.print("для" + a + ", " + b + ", " + c + "дискриминант равен: ");
        System.out.println(predicate.findDiscipt(a, b, c));
    }

}
