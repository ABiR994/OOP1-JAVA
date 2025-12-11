package Account;
public class CurrentAccount extends Account{
	public CurrentAccount(String accountNo, double balance)
	{
		super (accountNo, balance);
	}
	
	public double calculateInterest()
	{
		return getBalance()*0.05;
		
	}
	
	public void displayAcccount()
	{
		System.out.println("Current Account ");
		super.displayAcccount();
	}
}