package com.compilsoft.generics;

// using this for type inference
public class Bucket<T>{

    private T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return this.item;
    }

}
