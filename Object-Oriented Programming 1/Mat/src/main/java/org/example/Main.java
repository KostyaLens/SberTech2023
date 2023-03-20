package org.example;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3);
        matrix.setValueA(0, 0, 1);
        matrix.setValueA(0, 1, 1);
        matrix.setValueA(0, 2, 1);
        matrix.setValueA(1, 0, 1);
        matrix.setValueA(1, 1, 1);
        matrix.setValueA(1, 2, 1);
        matrix.setValueA(2, 0, 1);
        matrix.setValueA(2, 1, 1);
        matrix.setValueA(2, 2, 1);
        matrix.setValueB(0, 0, 1);
        matrix.setValueB(0, 1, 1);
        matrix.setValueB(0, 2, 1);
        matrix.setValueB(1, 0, 1);
        matrix.setValueB(1, 1, 1);
        matrix.setValueB(1, 2, 1);
        matrix.setValueB(2, 0, 1);
        matrix.setValueB(2, 1, 1);
        matrix.setValueB(2, 2, 1);
        matrix.Sum();
        matrix.Ym(2);
        matrix.Ym();
        matrix.print();
    }
}