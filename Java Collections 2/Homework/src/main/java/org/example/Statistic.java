package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class Statistic {
    private String name;
    public Statistic(String name){
        this.name = name;
    }
    private String[] words(String s) {
       s = s.replaceAll("[^A-Za-zА-Яа-я0-9 ]", "");
       s = s.toLowerCase();
       String[] words = s.split(" ");

       return words;
    }
    public HashMap<String, Integer> countWords(String name) {
        HashMap<String, Integer> map = new HashMap();
        Text text = new Text();
        String s = text.resetText(name);
        String[] words = words(s);
        for(String word: words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            }else {
                map.put(word, map.get(word) + 1);
            }
        }

        return map;
    }

    public void printStatistic(){
        HashMap map = countWords(this.name);
        for (Object key: map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }


}



