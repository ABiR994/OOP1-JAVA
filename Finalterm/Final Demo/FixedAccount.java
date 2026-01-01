// Final variable, method, and class demonstration

// final class → cannot be extended
public final class FixedAccount {
    private final String accNo;   // final variable → cannot change
    private double balance;
	private final int total = 40;
	

    public FixedAccount(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
	
		
    }
	
	void setBalance(double balance)
	{
		this.balance=balance;
	}

    public String getAccNo() { return accNo; }
    public double getBalance() { return balance; }

    // final method → cannot be overridden
    public final void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }
}

// Attempting to extend FixedAccount would cause error
// class SpecialAccount extends FixedAccount {}  //compile time error
