import book.*;
import bookshop.*;

public class Main {
    public static void main(String[] args) {
        BookShop bs = new BookShop("My Book Shop");

        Book sb1 = new StoryBook("ISBN001", "The Great Adventure", "John Doe", 19.99, 50, "Adventure");
        Book sb2 = new StoryBook("ISBN002", "Mystery of the Old House", "Jane Smith", 15.99, 30, "Mystery");

        bs.insertBook(sb1);
        bs.insertBook(sb2);

        System.out.println("All books in the shop:");
        bs.showAllBooks();

        bs.removeBook(sb1);

        System.out.println("After removing one book:");
        bs.showAllBooks();
    }
}
