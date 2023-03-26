package org.example;

import org.junit.Assert;

import java.lang.reflect.Method;
import java.util.Optional;

import static org.junit.Assert.*;

public class HashMapTest {

    @org.junit.Test
    public void AddHash() {
        HashMap<Integer, Integer> map = new HashMap();
        Integer k = map.Search(21);
        Assert.assertEquals(null, k);
        map.addHash(21, 21);
        int p = map.Search(21);
        Assert.assertEquals(21, p);
    }

    @org.junit.Test
    public void Search() {
        HashMap<Integer, String> map = new HashMap();
        map.addHash(41, "Василий");
        map.addHash(77, "Иван");
        int k = map.Search("Василий");
        Assert.assertEquals(41, k);
    }
    @org.junit.Test
    public void SearchWithKoliz1(){
        HashMap<Integer, Integer> map = new HashMap();
        map.addHash(41, 21);
        map.addHash(77, 1);
        try {
            Method method = HashMap.class.getDeclaredMethod("hash", Object.class);
            method.setAccessible(true);
            Assert.assertEquals((int) method.invoke(map, 21), (int) method.invoke(map, 1));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        int k = map.Search(1);
        Assert.assertEquals(77, k);
        int p = map.Search(21);
        Assert.assertEquals(41, p);
    }
    @org.junit.Test
    public void SearchWithKoliz2() {//колизия из-за которой я и спросил
        HashMap<Integer, Integer> map = new HashMap();
        map.addHash(41, 12);
        map.addHash(77, 342);
        try {
            Method method = HashMap.class.getDeclaredMethod("hash", Object.class);
            method.setAccessible(true);
            Assert.assertEquals((int) method.invoke(map, 12), (int) method.invoke(map, 342));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        int p = map.Search(12);
        Assert.assertEquals(41, p);
        int k = map.Search(342);
        Assert.assertEquals(77, k);

    }

}