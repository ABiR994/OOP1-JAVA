package Account;
public class Fixed Account extends Account{
	public class FixedAccount(String accountNo, double balance)
	{
		super (accountNo, balance);
	}
	
	public double calculateInterest()
	{
		return getBalance()*0.08;
		
	}
	
	public void displayAcccount()
	{
		System.out.println("Current Account ");
		super.displayAcccount();
	}
}