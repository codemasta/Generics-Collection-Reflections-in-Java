package com.compilsoft.generics.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingComparable {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Seun", "title 1", 200));
        books.add(new Book("Deola", "title 2", 100));
        books.add(new Book("Zuwe", "title 3", 20));
        books.add(new Book("Ade", "title 4", 50));

        Collections.sort(books);

        System.out.println(books);
    }
}
