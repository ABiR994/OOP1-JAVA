package book;

public class TextBook extends Book{

    private String standard;

    TextBook(){

    }
    TextBook(String isbn, String bookTitle, String authorName, double price ,int availableQuantity, String standard){
        super(isbn,bookTitle,authorName,price,availableQuantity);
        this.standard=standard;
    }
    public void setStandard(String standard){
        this.standard=standard;
    }
    public String getStandard(){
        return standard;
    }
    @Override
    public void showDetails(){
        System.out.println("ISBN :"+getIsbn());
        System.out.println("Book Title :"+getBookTitle());
        System.out.println("Author Name :"+getAuthorName());
        System.out.println("Price :"+getPrice());
        System.out.println("Available Quantity :"+getAvailableQuantity());
        System.out.println("Standard :"+standard);
    }

}
