package com.compilsoft.generics;

public class BoundedTypeParameter {

    public static <T extends Comparable<T>> T calculateMin(T t1 , T t2){

        if(t1.compareTo(t2) < 0){  // first is smaller
            return t1;
        }

        return t2;
    }
}
