package OOP_s.AdvacedOOP.LibraryManagement.abstractclasses;

public abstract class LibraryItem {
    protected String title;
    protected String id;

    public LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
    }

    public abstract void displayInfo();

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }
}