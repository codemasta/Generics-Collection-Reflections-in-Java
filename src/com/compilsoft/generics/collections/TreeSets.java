package com.compilsoft.generics.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {

    public static void main(String[] args) {

        Set<Integer> treeset = new TreeSet<>();

        treeset.add(12);
        treeset.add(-2);
        treeset.add(20);
        treeset.add(2);
        treeset.add(6);
        treeset.add(27);

        for (Integer s:
             treeset) {
            System.out.println(s);
        }
    }
}
