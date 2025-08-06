
public class Book {
    private String title;
    private String author;
    private String category;
    private String id;

    public Book(String bookTitle, String bookAuthor, String bookCategory, String id)
    {
        this.title = bookTitle;
        this.author = bookAuthor;
        this.category = bookCategory;
        this.id = id;
    }

    public void printBookDetails()
    {
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.category);
        System.out.println(this.id);
    }

    public String getTitle()
    {
        return this.title;
    }
}
