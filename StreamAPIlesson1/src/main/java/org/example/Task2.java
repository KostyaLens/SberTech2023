package org.example;

public class Task2 {
    public static void main(String[] args) {
        ToStringBiFunction str = (String s1, String s2) ->{
            if (s1.length() > s2.length()){
                return s1;
            }
            return s2;
        };
        System.out.println(str.findMaxLen("абоба", "ёлка"));
    }

}