package Account;
public class CurrentAccount extends Account implements Transaction{
	public CurrentAccount(String accountNo, double balance)
	{
		super (accountNo, balance);
	}
	
	public void deposit (double amount)
	{
		setBalance(getBalance() + amount); 
	
	}
	
	public double calculateInterest()
	{
		return getBalance()*0.05;
		
	}
	public void withdraw(double amount)
	{
		if (amount <= getBalance())
		{
			 setBalance(getBalance() - amount);   // update balance
			
			System.out.println(amount + " Withdrawn from " + getAccountNo() + "New Balance: "+getBalance());
		}
		else 
		{ 
	       System.out.println("Insufficient Balance in" +getAccountNo());
		}
	}
	
	
	public void displayAcccount()
	{
		System.out.println("Current Account ");
		super.displayAcccount();
	}
}