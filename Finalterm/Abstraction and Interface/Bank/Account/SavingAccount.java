package Account;
public class SavingAccount extends Account{
	public SavingAccount(String accountNo, double balance)
	{
		super (accountNo, balance);
	}
	
	public double calculateInterest()
	{
		return getBalance()*0.15;
		
	}
	
	public void displayAcccount()
	{
		System.out.println("Saving Account ");
		super.displayAcccount();
	}
}