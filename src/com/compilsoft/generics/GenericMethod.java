package com.compilsoft.generics;

public class GenericMethod {

    public <T> void showItem(T t){
        System.out.println("The item is : "+ t.toString());
    }

    public <T> T showItems(T t){
        return t;
    }

    public <T> void showArrays(T[] array){
        for (T item: array) {
            System.out.println(item.toString());
        }
    }
}
