
public class BookManagement {
    
    // Dummy implementation for demo
    public boolean checkoutBook(Student student, Book book)
    {
        System.out.println("Student " + student.Name + " is taking book " + book.getTitle());
        return true;
    }

    public boolean returnBook(Student student, Book book)
    {
        System.out.println("Student " + student.Name + " is returning book " + book.getTitle());
        return true;
    }
}
