package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a != 0 && b != 0) {
            Multiply multiply = new Multiply();
            try {
                System.out.println(multiply.umn(a, b));
            } catch (NotEvenExceptions e) {
                System.out.println("Мне не перемножить");;
            } finally {
                System.out.println("Классная сегодня погода");
            }
            a = scanner.nextInt();
            b = scanner.nextInt();

        }
    }
}