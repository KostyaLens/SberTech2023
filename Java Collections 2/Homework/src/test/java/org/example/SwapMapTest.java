package org.example;

import org.junit.Assert;

import java.util.HashMap;

import static org.junit.Assert.*;

public class SwapMapTest {

    @org.junit.Test
    public void inverse() {
        HashMap<Integer, String> map = new HashMap();
        HashMap<String, Integer> swapMap = new HashMap();
        map.put(12, "Иван");
        map.put(21, "Данила");
        map.put(13, "Костя");
        map.put(33, "Яр");
        swapMap.put("Иван", 12);
        swapMap.put("Данила", 21);
        swapMap.put("Костя", 13);
        swapMap.put("Яр", 33);
        SwapMap swapmap = new SwapMap();
        HashMap newmap = swapmap.inverse(map);
        Assert.assertEquals(swapMap, newmap);
    }
}