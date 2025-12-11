package Account;

public class Account {
	private String accountNo;
    private double balance;

    public Account(String accountNo, double balance) {
		this.accountNo = accountNo;
        this.balance = balance;
    }
	public String getAccountNo() { return accountNo; } 
    public double getBalance() { return balance; }
	
	public void displayAcccount()
	{
		System.out.println ("Account No: " +accountNo);
		System.out.println ("Available Balance :" +balance);
	}
		

    public void deposit(double amount) {
        balance += amount;
    }
	 public void deposit(double amount, String Note) {
        balance += amount;
    }
	
	public double calculateInterest()
	{
		return 0;
	}
}