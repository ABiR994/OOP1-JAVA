public class Start {
    public static void main(String[] args) {
        Library lib = new Library("City Library", 5);

        Book b1 = new ReferenceBook("978-3-16-148410-0", "Java Programming", true);
        Book b2 = new BorrowableBook("978-1-23-456789-0", "Data Structures", 10);

        lib.addBook(b1);
        lib.addBook(b2);

        lib.showBooks();

        BorrowableBook bb = (BorrowableBook) b2;
        System.out.println("Fine for late return (10 days): " + bb.calculateFine(10));
    }
}