public abstract class Book {
    private String isbn;
    private String title;

    Book() {
        this.isbn = "";
        this.title = "";
    }

    Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public abstract void showInfo();
}