package org.example;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair(3, "key");
        System.out.println((int)pair.getKey());
        System.out.println((String) pair.getData());
        pair.setKey(2);
        pair.setData("No key");
        System.out.println((int)pair.getKey());
        System.out.println((String)pair.getData());
    }
}