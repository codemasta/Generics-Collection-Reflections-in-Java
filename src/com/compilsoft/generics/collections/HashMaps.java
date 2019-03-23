package com.compilsoft.generics.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    public static void main(String[] args) {

        Map<String , Integer> map = new HashMap<>();
        map.put("Seun",100);
        map.put("Daniel", 98);
        map.put("Tgirl",99);
        map.put("Dupe",100);
        map.put("Tola", 908);
        map.put("Sola",919);

        System.out.println(map.get("Tgirl"));
        System.out.println(map.get("Deola"));

    }
}
