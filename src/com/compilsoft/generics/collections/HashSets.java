package com.compilsoft.generics.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Seun");
        set.add("Bola");
        set.add("Ade");
        set.add("Zuweratu");
        set.add("Jide");

        System.out.println(set.contains("Adam"));

        for (String s:
             set) {
            System.out.println(s);
        }
    }
}
