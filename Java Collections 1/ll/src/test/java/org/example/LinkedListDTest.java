package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListDTest {

    @org.junit.Test
    public void add() {
        LinkedListD <Integer> ll = new LinkedListD();
        ll.add(1);
        int size = ll.size();
        int k = (Integer)ll.get(size-1);
        Assert.assertEquals(1, k);
        ll.add(6);
        size = ll.size();
        k = ll.get(size-1);
        Assert.assertEquals(6, k);
    }

    @org.junit.Test
    public void get() {
        LinkedListD<Integer> ll = new LinkedListD();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        int k = ll.get(2);
        Assert.assertEquals(3, k);
    }

    @org.junit.Test
    public void size() {
        int n = (int) (Math.random()*39)+1;
        LinkedListD <Integer> ll = new LinkedListD();
        for(int i = 0; i < n; i++){
            ll.add(2);
        }
        Assert.assertEquals(n, ll.size());
    }
}