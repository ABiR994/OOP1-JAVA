package book;

public class StoryBook extends Book{

	private String category;

	StoryBook(){

	}
	public StoryBook(String isbn, String bookTitle, String authorName, double price ,int availableQuantity, String category){
		super(isbn,bookTitle,authorName,price,availableQuantity);
		this.category=category;
	}
	public void setCategory(String category){
		this.category=category;
	}
	public String getCategory(){
		return category;
	}
	@Override
	public void showDetails(){
		System.out.println("ISBN :"+getIsbn());
		System.out.println("Book Title :"+getBookTitle());
		System.out.println("Author Name :"+getAuthorName());
		System.out.println("Price :"+getPrice());
		System.out.println("Available Quantity :"+getAvailableQuantity());
		System.out.println("Category :"+category);
	}

}