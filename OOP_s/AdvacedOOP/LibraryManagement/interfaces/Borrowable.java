package OOP_s.AdvacedOOP.LibraryManagement.interfaces;

public interface Borrowable {
    void borrow(String memberName);
    void returnItem(String memberName);
}