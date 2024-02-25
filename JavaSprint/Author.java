import java.text.SimpleDateFormat;
import java.util.Date; 

public class Author {
    private String name;
    private Date dateOfBirth;
    private Book[] booksWritten;

    public Author(String name, Date dateOfBirth, Book[] booksWritten) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;  
        this.booksWritten = booksWritten;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for dateOfBirth
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    
    // Getter method for booksWritten
    public Book[] getBooksWritten() {
        return booksWritten;
    }

    // toString method to represent Author information
    public String toString() {
        return name + " | " + getDateOfBirthAsString();
    }

    // Returns dateOfBirth as a String in the format "yyyy-MM-dd"
    public String getDateOfBirthAsString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(dateOfBirth);
    }

    // Returns titles of books written by the author as a String
    public String getBooksWrittenAsString() {
        if (booksWritten == null || booksWritten.length == 0) {
            return "No books written.";
        }
        StringBuilder booksString = new StringBuilder();
        for (Book book : booksWritten) {
            booksString.append(book.getTitle()).append(", ");
        }
        return booksString.substring(0, booksString.length() - 2);
    }

    // Setter method for changing name
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for changing dateOfBirth
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Adds a book to the booksWritten array
    public void addBook(Book book) {
        if (booksWritten == null) {
            booksWritten = new Book[]{book};
        } else {
            Book[] newBooksArray = new Book[booksWritten.length + 1];
            System.arraycopy(booksWritten, 0, newBooksArray, 0, booksWritten.length);
            newBooksArray[booksWritten.length] = book;
            booksWritten = newBooksArray;
        }
    }
}