public class Customer
{
	private String name;
	
	private Account[] accounts;
	
	
	public Customer ()
	{}
	public Customer (String name, Account [] accounts )
	{
		this.name = name;
		this.accounts = accounts;
	}
	
	public void setName (String name){
		this. name = name; 
	}
	public String getName ()
	{
		return name;
	}
	public void setAccount (Account [] accounts)
	{
		this.accounts = accounts;
	}
	public Account[] getAccount ()
	{
		return accounts;
	}
	
	public void Display ()
	{
		System.out.println (" Customer  Name :" +name);
		System.out.println (" Account Details:  ");
		for (int i = 0; i < accounts.length ; i++)
		{
			if (accounts[i] != null)
			{
			accounts [i].display() ;
			}
			
		}
			
		
	}
}
		
		
		
		
	