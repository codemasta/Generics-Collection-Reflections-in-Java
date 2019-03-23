package com.compilsoft.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Store<Integer> store = new Store<Integer>();
        store.setItem(56);
        System.out.println(store.getItem());

        System.out.println("=====================");

        HashsTable<String, Integer> hashsTable = new HashsTable<>("Seun", 45);
        System.out.println(hashsTable);

        System.out.println("=====================");

        GenericMethod genericMethod = new GenericMethod();
        genericMethod.showItem("Hello World");
        String result = genericMethod.showItems("Hello World from Returned");
        Integer result2 = genericMethod.showItems(567);
        System.out.println("The returned item : "+ result);

        System.out.println("=====================");

        Integer[] integersArrays = {2,3,45,6,7,4,3};
        String [] names = {"Seun","Daniel","Dupe","Wale"};
        genericMethod.showArrays(integersArrays);
        genericMethod.showArrays(names);

        System.out.println("=====================");

        Integer boundResult = BoundedTypeParameter.calculateMin(4516,678);
        Character boundResult2 = BoundedTypeParameter.calculateMin('g','e');
        System.out.println("The smaller is "+ boundResult);
        System.out.println("The smaller is "+ boundResult2);
    }

    public static void add(int num1 , int num2){
        System.out.println("The sum = " + (num1 + num2));
    }





}
