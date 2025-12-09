public class Main
{
	public static void main (String []args)
	{
		Account a1 = new Account ("CA- 1101 ", 50000);
		
		Customer c1 = new Customer ("Alex " , a1 );
		c1.Display ();

	}
}
