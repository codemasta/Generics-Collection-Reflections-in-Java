package com.compilsoft.generics.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingComparator {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Seun Ade", "title 1", 200));
        books.add(new Book("Deola John", "title 2", 100));
        books.add(new Book("Zuwe Ratu", "title 3", 20));
        books.add(new Book("Ade Lola", "title 4", 50));

        Collections.sort(books,new BookComparator().reversed());
        Collections.sort(books,new BookComparator());

        System.out.println(books);
    }
}
