public class BorrowableBook extends Book implements ILoanable {
    private int borrowedDays;

    BorrowableBook() {
        super();
        this.borrowedDays = 0;
    }

    BorrowableBook(String isbn, String title, int borrowedDays) {
        super(isbn, title);
        this.borrowedDays = borrowedDays;
    }

    public void setBorrowedDays(int borrowedDays) {
        this.borrowedDays = borrowedDays;
    }

    public int getBorrowedDays() {
        return borrowedDays;
    }

    @Override
    public double calculateFine(int daysLate) {
        double fine = 0;
        if(daysLate > 7) {
            fine = daysLate * 5.0;
        } else {
            fine = daysLate * 2.0;
        }
        return fine;
    }

    @Override
    public void showInfo() {
        System.out.println("ISBN: " + this.getIsbn());
        System.out.println("Title: " + this.getTitle());
        System.out.println("Borrowed Days: " + this.getBorrowedDays());
    }
}