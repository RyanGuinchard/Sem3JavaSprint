import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Book> borrowedBooks;

    // Constructor
    public Patron(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getter methods

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Getter for phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Getter for borrowed books
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Setter methods

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    // Setter for phone number
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Setter for borrowed books
    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    // Method to add a borrowed book
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    // Method to return a borrowed book
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}
