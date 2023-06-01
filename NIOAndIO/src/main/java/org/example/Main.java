package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = scan.nextLine();

        FilleInterface io = new IO();
        System.out.print("Введите название первого файла: ");
        String name0 = scan.nextLine();
        io.writeFile(name0, s);
        String ioStr = io.readFile(name0);

        FilleInterface nio = new NIO();
        System.out.print("Введите название второго файла: ");
        String name1 = scan.nextLine();
        nio.writeFile(name1, s);
        String nioStr = nio.readFile(name1);

        System.out.println(ioStr);
        System.out.println(nioStr);
    }
}