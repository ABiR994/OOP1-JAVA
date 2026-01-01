
import Customer.*;
import Account.*;

public class Main {
    public static void main(String[] args) {
		
		Account a2 = new CurrentAccount("CA-1005", 20000);
		Account a3 = new CurrentAccount("SA-1007", 25000);
		Account [] accountArray = new Account[5];
		accountArray[0] =  a2;
		accountArray[1] = a3;

        Customer c1 = new Customer("Alex", accountArray);
	//	a2.diposit(10000); error. a1 is the reference variable. determines which methods you are allowed to call
		c1.showDetails();
		((Transaction) a2).deposit(10000);// typecasting
		
		CurrentAccount ca1= new CurrentAccount("CA-1100",50000);
		ca1.withdraw(25000);// typecasting not required
		ca1.displayAcccount();
		
	

    }
}