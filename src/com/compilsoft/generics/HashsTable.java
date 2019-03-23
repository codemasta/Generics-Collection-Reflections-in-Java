package com.compilsoft.generics;

public class HashsTable<K, V>{

    private K key;
    private V value;

    public HashsTable(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "HashsTable{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
