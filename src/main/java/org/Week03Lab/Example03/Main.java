package org.Week03Lab.Example03;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Original Book
        List<String> authors = new ArrayList<>();
        authors.add("Author1");
        Book originalBook = new Book("Design Patterns", authors);

        // Deep Clone using modified clone()
        Book clonedBook = (Book) originalBook.clone();

        // Modify Authors in Original
        originalBook.addAuthor("Author2");

        // Display Results
        System.out.println("After modifying original book:");
        System.out.println("Original Book:");
        originalBook.displayBook();

        System.out.println("Cloned Book:");
        clonedBook.displayBook();
    }
}


