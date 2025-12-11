  
import Customer.*;
import Account.*;

public class Main {
    public static void main(String[] args) {
		
		Account a1 = new SavingAccount("SA-1001", 20000);
		Account a2 = new CurrentAccount("CA-1005", 20000);
		Account a3 = new CurrentAccount("SA-1007", 25000);

		
		Account [] accountArray = new Account[5];
		accountArray[0] =  a1;
		accountArray[1] = a2;
	

        Customer c1 = new Customer("Alex", accountArray);
		a1.deposit(2000);
		a2.deposit(2000, "bonus");
		c1.showDetails();
		
		c1.addAccount(a3);
		c1.showDetails();

    }
}