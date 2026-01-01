package Account;

public abstract class Account{
	private String accountNo;
    private double balance;

    public Account(String accountNo, double balance) {
		this.accountNo = accountNo;
        this.balance = balance;
    }
	public void setAccountNo (String accountNo)
	{
		this.accountNo = accountNo;
	}
	
	
	public void setBalance (double balance)
	{
		this.balance = balance;
	}
	
	public String getAccountNo() { return accountNo; } 
    public double getBalance() { return balance; }
	
	public void displayAcccount()
	{
		System.out.println ("Account No: " +accountNo);
		System.out.println ("Available Balance :" +balance);
	}
	
	public abstract double calculateInterest();
}
	
	