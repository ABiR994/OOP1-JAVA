package bookshop;

import book.*;

public class BookShop implements BookShopOperations {
    private String name ;

    Book listOfBooks[] = new Book[100];

    BookShop(){

    }
    public BookShop(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public boolean insertBook(Book b){
        for(int i=0; i<listOfBooks.length; i++){
            if(listOfBooks[i]==null){
                listOfBooks[i]=b;
                return true;
            }
        }
        return false;
    }
    public boolean removeBook(Book b){
        for(int i=0; i<listOfBooks.length; i++){
            if(listOfBooks[i]==b){
                listOfBooks[i]=null;
                return true;
            }
        }
        return false;
    }
    public void showAllBooks(){
        for(Book b : listOfBooks){
            if(b != null){
                b.showDetails();
                System.out.println();
            }
        }
    }
    public Book searchBookByIsbn(String isbn){
        for(Book b : listOfBooks){
            if(b != null && b.getIsbn().equals(isbn)){
                return b;
            }
        }
        return null;
    }
}