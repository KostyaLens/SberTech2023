package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class StatisticTest {

    @Test
    public void countWords() {
        Statistic statistic = new Statistic("Тест.txt");
        HashMap<String, Integer> map = new HashMap();
        map.put("бебра", 5);
        map.put("овца", 2);
        map.put("козел", 1);
        map.put("бран", 1);
        map.put("лев", 1);
        map.put("ништяк", 1);
        HashMap table = statistic.countWords("Тест.txt");
        Assert.assertEquals(map, table);
    }
}