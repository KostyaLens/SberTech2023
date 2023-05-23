package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class StringToMap {
    public HashMap<String, String> convertStringToMap(String s){
        HashMap<String, String> map = (HashMap<String, String>) Arrays.stream(s.split("-")).
                skip(1).
                map(str -> str.split(" ")).
                collect(Collectors.toMap(a -> "-"+ a[0], a -> a[1]));
        return map;
    }

    public String convertMapToString(HashMap<String, String> map){
       String s = map.entrySet().
       stream().
               map(mapHash -> mapHash.getKey() + " " + mapHash.getValue()).
               collect(Collectors.joining(" ", "", "")).
               toString();
       return s;
    }
}
