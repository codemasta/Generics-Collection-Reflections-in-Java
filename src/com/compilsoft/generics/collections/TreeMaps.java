package com.compilsoft.generics.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {

    public static void main(String[] args) {

        Map<String, Integer> treeMap = new TreeMap<>();

        // TreeMap are sorted naturally by their key

        treeMap.put("Ade", 45);
        treeMap.put("Deola", 10);
        treeMap.put("Segun", 34);
        treeMap.put("Kemi", 89);
        treeMap.put("Kunle", 5);

        for (String s:
             treeMap.keySet()) {
            System.out.println(s +" = " +treeMap.get(s));
        }

    }
}
