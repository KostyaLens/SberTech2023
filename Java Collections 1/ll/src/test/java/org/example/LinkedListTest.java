package org.example;

import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.*;

public class LinkedListTest {

    @org.junit.Test
    public void add() {
        LinkedList ll = new LinkedList();
        ll.add(1);
        int size = ll.size();
        int k = (Integer)ll.get(size-1);
        Assert.assertEquals(1, k);
        ll.add(6);
        size = ll.size();
        k = (Integer)ll.get(size-1);
        Assert.assertEquals(6, k);
    }

    @org.junit.Test
    public void get() {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        int k = (Integer)ll.get(2);
        Assert.assertEquals(3, k);
    }

    @org.junit.Test
    public void size() {
        int n = (int) (Math.random()*39)+1;
        LinkedList ll = new LinkedList();
        for(int i = 0; i < n; i++){
            ll.add(2);
        }
        Assert.assertEquals(n, ll.size());
    }
}