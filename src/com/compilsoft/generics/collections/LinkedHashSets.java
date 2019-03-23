package com.compilsoft.generics.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets {

    public static void main(String[] args) {

        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Fola");
        linkedHashSet.add("Agoro");
        linkedHashSet.add("Sola");
        linkedHashSet.add("Yaba");

        for (String s:
             linkedHashSet) {
            System.out.println(s);
        }
    }
}
