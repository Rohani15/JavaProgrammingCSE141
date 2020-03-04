
public class VipCustomer 
{
	private String name;
	private double creditLine;
	private String email;
	
	
	
	public VipCustomer(String name, double creditLine, String email) 
	{
		this.name = name;
		this.creditLine = creditLine;
		this.email = email;
	}
	
	public VipCustomer(String name, double creditLine)  //pass on the 2 values it recieved and add a default value for the third
	{
		this(name, creditLine, ""); 
	}

	public VipCustomer() //should save all the fields
	{
		this("Default name", 50000.00, "default@email.com");
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getCreditLine() 
	{
		return creditLine;
	}
	public void setCreditLine(double creditLine) 
	{
		this.creditLine = creditLine;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	} 
	
	
}
