package com.compilsoft.generics;

public class Store<T> { // where the T is the wildcard

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return item.toString();
    }
}
