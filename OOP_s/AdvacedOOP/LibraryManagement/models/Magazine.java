package models;

import abstractclasses.LibraryItem;
import interfaces.Borrowable;

public class Magazine extends LibraryItem implements Borrowable {
    private String publisher;

    public Magazine(String title, String id, String publisher) {
        super(title, id);
        this.publisher = publisher;
    }

    @Override
    public void displayInfo() {
        System.out.println("🗞️ Magazine: " + title + ", Publisher: " + publisher + ", ID: " + id);
    }

    @Override
    public void borrow(String memberName) {
        System.out.println(memberName + " borrowed the magazine: " + title);
    }

    @Override
    public void returnItem(String memberName) {
        System.out.println(memberName + " returned the magazine: " + title);
    }
}