public class Library {
    private String name;
    private Book books[];
    private int count = 0;

    Library() {}

    Library(String name, int size) {
        this.name = name;
        this.books = new Book[size];
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(Book books[]) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public Book[] getBooks() {
        return books;
    }


    public void addBook(Book b) {
        if(count < books.length) {
            books[count] = b;
            count++;
        }
    }

    public void showBooks() {
        for(int i = 0; i < count; i++) {
            if(books[i] != null) {
                books[i].showInfo();
                System.out.println();
            }
        }
    }
}