package org.example;

import java.util.stream.IntStream;

public class TableMulT {
    public void printTableMult(){
        IntStream.rangeClosed(1, 9).
                forEach(x -> IntStream.rangeClosed(1, 9).
                        forEach(y -> System.out.println(x + " * " + y + "= " + x*y)));
    }
}
