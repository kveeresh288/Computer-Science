package OOP_s.AdvacedOOP.LibraryManagement.system;

import abstractclasses.LibraryItem;

public class LibrarySystem {

    public void checkAvailability(LibraryItem item) {
        System.out.println("Checking availability for: " + item.getTitle());
    }

    public void printDetails(LibraryItem item) {
        item.displayInfo();
    }
}