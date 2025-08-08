package models;

import abstractclasses.LibraryItem;
import interfaces.Borrowable;

public class Book extends LibraryItem implements Borrowable {
    private String author;

    public Book(String title, String id, String author) {
        super(title, id);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("📖 Book: " + title + ", ID: " + id + ", Author: " + author);
    }

    @Override
    public void borrow(String memberName) {
        System.out.println(memberName + " borrowed the book: " + title);
    }

    @Override
    public void returnItem(String memberName) {
        System.out.println(memberName + " returned the book: " + title);
    }
}