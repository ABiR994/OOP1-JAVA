package Customer;

import Account.*;

public class Customer {
    private String name;
    private Account[] accounts;

    public Customer(String name, Account [] accounts) {
        this.name = name;
        this. accounts = accounts;
    }

   
    public void showDetails() {
        System.out.println("Customer: " + name);
		System.out.println ("Accounts:");
        for (int i = 0; i < accounts.length; i++) {
			Account acc = accounts [i];
			if (acc !=  null)
			{
            System.out.println((i+1) + ". " +accounts[i].getAccountNo() +
			" -> Balance: " + accounts[i].getBalance() + ",Interest earned : "+acc.calculateInterest() );}
        }
    }
	public void addAccount(Account acc)
	{
		for (int i =0; i<accounts.length; i++)
		{
			if (accounts[i] == null)
			{
				accounts[i] = acc;
				System.out.println("Newly Added account number: "+acc.getAccountNo());
				return;
			}
		}
		System.out.println ("Cannot add more accounts");
		
	}			
				
}