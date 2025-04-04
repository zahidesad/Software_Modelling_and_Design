package org.week03_lab.example03;

import java.util.ArrayList;
import java.util.List;

public class Book implements Cloneable{
    private String title;
    private List<String> authors;

    // Constructor
    public Book(String title, List<String> authors) {
        this.title = title;
        this.authors = authors;
    }

    // Getter Methods
    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    // Method to Add an Author
    public void addAuthor(String author) {
        authors.add(author);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book clonedBook = (Book) super.clone();
        clonedBook.authors = new ArrayList<>(this.authors);
        return clonedBook;
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Authors: " + authors);
    }
}
