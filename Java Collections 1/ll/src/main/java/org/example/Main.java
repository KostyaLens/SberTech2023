package org.example;


public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        LinkedListD <String> ll1 = new LinkedListD();
        ll.add(2);
        System.out.println(ll.size());
        System.out.println((Integer) ll.get(0));
        System.out.println((String) ll.get(0));
        ll1.add("10");
        ll1.add("32");
        System.out.println(ll1.get(1));
    }
}