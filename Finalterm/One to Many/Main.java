public class Main
{
	public static void main (String []args)
	{
		Account [] AccArr = new Account [5];
		
		AccArr [0] = new Account ("CA- 1101 ", 50000);
		AccArr[1] = new Account ("SA - 1102 ", 100000);
		AccArr [2] = new Account (" FD - 1103", 20000);
		
		
		
		Customer c1 = new Customer ("Alex " , AccArr );
		
		c1.Display ();

	}
}
