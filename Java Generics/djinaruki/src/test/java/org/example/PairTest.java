package org.example;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {

    @org.junit.jupiter.api.Test
    void getKey() {
        Pair<Integer, String> pair = new Pair(12, "32");
        int k = pair.getKey();
        Assert.assertEquals(12 , k);
    }

    @org.junit.jupiter.api.Test
    void getData() {
        Pair<Integer, String> pair = new Pair(12, "32");
        String k = pair.getData();
        Assert.assertEquals("32", k);
    }

    @org.junit.jupiter.api.Test
    void setKey() {
        Pair<Integer, String> pair = new Pair(12, "32");
        pair.setKey(6);
        int k = pair.getKey();
        Assert.assertEquals(6, k);
    }

    @org.junit.jupiter.api.Test
    void setData() {
        Pair<Integer, String> pair = new Pair(12, "32");
        pair.setData("хахахаха смешня шутка");
        String k = pair.getData();
        Assert.assertEquals("хахахаха смешня шутка", k);
    }
}