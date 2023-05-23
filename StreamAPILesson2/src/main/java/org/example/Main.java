package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TableMulT tableMulT = new TableMulT();
        tableMulT.printTableMult();
        StringToMap stringToMap = new StringToMap();
        System.out.println(stringToMap.convertStringToMap("-21 2 -sdf 32 -32 w"));
        String s = "-ёлка 3 -снег 3 -новыйгод 8";
        HashMap<String, String> map = stringToMap.convertStringToMap(s);
        System.out.println(s);
        System.out.println(stringToMap.convertMapToString(map));


    }
}