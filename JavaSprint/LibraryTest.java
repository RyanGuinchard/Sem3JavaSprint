import java.util.Date;

public class LibraryTest {
    public static void main(String[] args) {
        // Create library
        Library library = new Library();

        //Load initial data with method
        loadInitialData(library);

        //Load library testing (Trying setting it up like methods, let me know if needed to change Dr.Malik)
        testLibraryFeatures(library);
    }

    private static void loadInitialData(Library library) {
        // Add books
        Book book1 = new Book("Java Programming", new Author("John Doe", new Date(), null), "978-0134685991", "Pearson", 5);
        Book book2 = new Book("Introduction to Algorithms", new Author("Thomas H. Cormen", new Date(), null), "978-0262033848", "MIT Press", 3);
        Book book3 = new Book("The Great Gatsby", new Author("F. Scott Fitzgerald", new Date(), null), "978-0743273565", "Scribner", 7);
        Book book4 = new Book("To Kill a Mockingbird", new Author("Harper Lee", new Date(), null), "978-0061120084", "Harper Perennial", 4);
        Book book5 = new Book("1984", new Author("George Orwell", new Date(), null), "978-0451524935", "Signet Classic", 6);

        // Add authors
        Author author1 = new Author("John Doe", new Date(), new Book[]{book1});
        Author author2 = new Author("Thomas H. Cormen", new Date(), new Book[]{book2});
        Author author3 = new Author("F. Scott Fitzgerald", new Date(), new Book[]{book3});
        Author author4 = new Author("Harper Lee", new Date(), new Book[]{book4});
        Author author5 = new Author("George Orwell", new Date(), new Book[]{book5});

        // Add patrons
        Patron patron1 = new Patron("Alice Smith", "123 Main St", "555-1234");
        Patron patron2 = new Patron("Bob Johnson", "456 Elm St", "555-5678");
        Patron patron3 = new Patron("Charlie Brown", "789 Oak St", "555-9012");
        Patron patron4 = new Patron("David Wilson", "101 Pine St", "555-3456");


        // Add data to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        library.addAuthor(author1);
        library.addAuthor(author2);
        library.addAuthor(author3);
        library.addAuthor(author4);
        library.addAuthor(author5);

        library.addPatron(patron1);
        library.addPatron(patron2);
        library.addPatron(patron3);
        library.addPatron(patron4);
    }

    private static void testLibraryFeatures(Library library) {
        // Test searching for books by title
        System.out.println("Books with 'Java' in title:");
        library.searchBooksByTitle("Java").forEach(System.out::println);

        // Test searching for books by author
        System.out.println("\nBooks by author 'John Doe':");
        library.searchBooksByAuthor("John Doe").forEach(System.out::println);

        // Test searching for books by ISBN
        System.out.println("\nBook with ISBN '978-0134685991':");
        Book foundBook = library.searchBooksByISBN("978-0134685991");
        System.out.println(foundBook);

        // Test borrowing and returning books
        Patron testPatron = library.getPatrons().get(0);
        Book testBook = library.getBooks().get(0);

        System.out.println("\nTesting borrowing and returning:");
        library.borrowBook(testBook, testPatron);
        library.returnBook(testBook, testPatron);
    }
}
