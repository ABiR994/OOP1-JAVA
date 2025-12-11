public class Customer
{
	private String name;
	
	private Account account;
	
	
	public Customer ()
	{}
	public Customer (String name, Account account )
	{
		this.name = name;
		this.account = account;
	}
	
	public void setName (String name){
		this. name = name; 
	}
	public String getName ()
	{
		return name;
	}
	public void setAccount (Account account)
	{
		this.account = account;
	}
	public Account getAccount ()
	{
		return account;
	}
	
	public void Display ()
	{
		System.out.println (" Customer  Name :" +name);
		System.out.println (" Account Details:  ");
		account.display();
	}
}
		
		
		
		
	