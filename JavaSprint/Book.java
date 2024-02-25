public class Book implements Borrowable {
    private String title;
    private Author author;
    private String ISBN;
    private String publisher;
    private Integer numberOfCopies;
    private Status status;

    // Constructor
    public Book(String title, Author author, String ISBN, String publisher, Integer numberOfCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.numberOfCopies = numberOfCopies;
        this.status = Status.AVAILABLE;
    }

    // Getters and setters

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for author
    public Author getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(Author author) {
        this.author = author;
    }

    // Getter for ISBN
    public String getISBN() {
        return ISBN;
    }

    // Setter for ISBN
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    // Getter for publisher
    public String getPublisher() {
        return publisher;
    }

    // Setter for publisher
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Getter for number of copies
    public Integer getNumberOfCopies() {
        return numberOfCopies;
    }

    // Setter for number of copies
    public void setNumberOfCopies(Integer numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    // Getter for status
    public Status getStatus() {
        return status;
    }

    // Setter for status
    public void setStatus(Status status) {
        this.status = status;
    }

    // toString method
    @Override
    public String toString() {
        return this.title + " by " + this.author.getName();
    }

    // Borrow method
    @Override
    public void borrowBook() {
        if (status == Status.AVAILABLE) {
            status = Status.CHECKED_OUT;
            System.out.println("Book checked out successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    // Return method
    @Override
    public void returnBook() {
        if (status == Status.CHECKED_OUT) {
            status = Status.AVAILABLE;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Cannot return book.");
        }
    }
}
