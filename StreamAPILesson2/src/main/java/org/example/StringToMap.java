package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StringToMap {
    public LinkedHashMap<String, String> convertStringToMap(String s){
        String str[]  = s.split(" ");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length-1; i += 2){
            map.put(str[i], str[i+1]);
        }
        return map;
    }

    public String convertMapToString(LinkedHashMap<String, String> map){
       String s = map.entrySet().
       stream().
               map(mapHash -> mapHash.getKey() + " " + mapHash.getValue()).
               collect(Collectors.joining(" ", "", "")).
               toString();
       return s;
    }
}
