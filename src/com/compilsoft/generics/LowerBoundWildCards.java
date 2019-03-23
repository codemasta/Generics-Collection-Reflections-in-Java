package com.compilsoft.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerBoundWildCards {
    public static void main(String[] args) {

       List<Serializable> list = new ArrayList<>();
       list.add("Seun");
       list.add("Sola");
       list.add("Tola");

       show(list);
    }

    /* "? super T"
    *   You can specify an upper bound or lower bound but cannot specify both
    *   If you use "? super Integer" -> you can use any super type of integer so Number or Object as well
    *
    *
    *   List<? super Integer> l = new ArrayList<Integer>()
    *   List<? super Integer> l = new ArrayList<Object>()
    *   List<? super Integer> l = new ArrayList<Number>()
    *
    *   Reading --> not guaranteed an Integer because it may be pointing to a Number
    *               The only guarantee is an Object or a subclass of object
    *
    *   Writing --> you can not add object or serializable to a List<? super Number> even though Number
    *               extends Object and Serializable
    *
    *               You can add Integer or Double or ... but using List<Double> would be too restrictive
    *
    *   LowerBound allows us to WRITE/ READ
    * */
    // The super types only


    public static void show(List<? super Number> list){

        list.add(1000);
        list.add(45.98f);

        for (Object o: list) {
            System.out.println(o);
        }

    }
}
