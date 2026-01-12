public class ReferenceBook extends Book {
    private boolean restricted;

    ReferenceBook() {
        super();
        this.restricted = false;
    }

    ReferenceBook(String isbn, String title, boolean restricted) {
        super(isbn, title);
        this.restricted = restricted;
    }

    public void setRestricted(boolean restricted) {
        this.restricted = restricted;
    }

    public boolean getRestricted() {
        return restricted;
    }

    @Override
    public void showInfo() {
        System.out.println("ISBN: " + this.getIsbn());
        System.out.println("Title: " + this.getTitle());
        if(this.getRestricted()) {
            System.out.println("Restricted: Yes");
        } else {
            System.out.println("Restricted: No");
        }
    }
}