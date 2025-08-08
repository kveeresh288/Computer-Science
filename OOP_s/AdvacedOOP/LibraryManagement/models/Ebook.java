package models;

import abstractclasses.LibraryItem;

public class Ebook extends LibraryItem {

    private String format;

    public Ebook(String title, String id, String format) {
        super(title, id);
        this.format = format;
    }

    @Override
    public void displayInfo() {
        System.out.println("💾 Ebook: " + title + ", Format: " + format + ", ID: " + id);
    }

    // Not Borrowable – demonstrating abstraction with no interface implementation
}