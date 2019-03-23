package com.compilsoft.generics;

import java.util.ArrayList;
import java.util.List;

public class TypeInference {
    public static void main(String[] args) {

        List<Bucket<String>> bucketList = new ArrayList<>();
        TypeInference.addStore("Seun",bucketList);
        // OR specifying explicitly <String>  => type witness
        TypeInference.<String>addStore("Seun", bucketList);

    }

    // code for type inference
    public static <T> void addStore(T t , List<Bucket<T>> buckets){
        Bucket<T> bucket = new Bucket<>();
        bucket.setItem(t);
        buckets.add(bucket);
        System.out.println(t.toString() + " has been added to the list");
    }
}

