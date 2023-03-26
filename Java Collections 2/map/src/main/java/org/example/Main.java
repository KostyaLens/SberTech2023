package org.example;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap();
        map.addHash(1, 21);
        map.addHash(42, 342);
        map.addHash(2, 12);
        map.addHash(2, 23);
        map.addHash(11, 1);
        System.out.println(map.Search(12));
    }
}