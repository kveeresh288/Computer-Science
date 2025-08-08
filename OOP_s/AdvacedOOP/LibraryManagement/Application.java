package OOP_s.AdvacedOOP.LibraryManagement;

import models.Book;
import models.Magazine;
import models.Ebook;
import system.LibrarySystem;

public class Application {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "B001", "James Gosling");
        Magazine magazine = new Magazine("Tech Today", "M101", "OpenAI Media");
        Ebook ebook = new Ebook("AI Revolution", "E007", "PDF");

        LibrarySystem system = new LibrarySystem();

        // Displaying Info
        system.printDetails(book);
        system.printDetails(magazine);
        system.printDetails(ebook);

        // Borrow and return actions
        book.borrow("Veeresh");
        book.returnItem("Veeresh");

        magazine.borrow("John");
        magazine.returnItem("John");

        // Ebook not borrowable – abstraction in action
    }
}