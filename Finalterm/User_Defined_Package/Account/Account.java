package Account;
public class Account
{
	private String account_no ;
	private double balance;
	
    public Account () {}
    public Account (String account_no, double balance)
	{
       this.account_no = account_no;
       this.balance = balance;
	}
    public void setAccNo (String account_no)
	{
		this.account_no = account_no;
	}
	public String getAccNo ()
	{
		return account_no;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double amount)
	{
		if (amount> 0)
		{
			balance = balance+ amount;
		}
	}
	public void display()
	{
		System.out.println ("Account Number : " +account_no);
        System.out.println ("Account Balance : " +balance);
	}
}	
			
	
		
		