package bookshop;

import book.*;

public interface BookShopOperations {
    public abstract boolean insertBook(Book b);
    public abstract boolean removeBook(Book b);
    public abstract void showAllBooks();
    public abstract Book searchBookByIsbn(String isbn);
}
