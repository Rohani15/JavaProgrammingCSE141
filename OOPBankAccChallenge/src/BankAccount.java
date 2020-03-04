
public class BankAccount 
{
	private String number;
	private int balance;
	private String customerName;
	private String email; 
	private int phoneNumber;
	
	public BankAccount() // a constructor. used to intialize the obj u are using (BankAccount bobsAccount = new BankAccount();)
	{
		this("56789", 2, "default name", "default email", 1234455); 
		//^^ these are the paramters used when creating this obj if u create an obj from this class and dont ger any parameters
		System.out.println("empty constructor called");
	}
	public BankAccount(String number, int balance, String customerName, String email, int phoneNumber)
	{
		System.out.println("Account constructors called");
		this.number = number;
		this.balance = balance;
		this.customerName = customerName; 
		this.email = email;
		this.phoneNumber = phoneNumber; 
		//what this is doing is setting the field values in the constructor. 
	}
	
	public BankAccount(String number, String customerName, String email, int phoneNumber) 
	{
		this("99999", 100, customerName, email, phoneNumber);
		this.number = number;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.customerName = customerName;
	}
	public void depositFunds(double depositAmount)
	{
		balance += depositAmount; 
		System.out.println("Deposit of " + depositAmount + " made");
	}
	public void withdrawFunds(double withdrawalAmount)
	{
		if(balance - withdrawalAmount <= 0)
		{
			System.out.println("Only " + balance + " available. not processed");
		}
		else
		{
			balance -= withdrawalAmount; 
			System.out.println("Withdrawl of " + withdrawalAmount + " Processed " + balance + " left");
		}
	}
	public String getNumber() 
	{
		return number;
	}
	public void setNumber(String number)
	{
		this.number = number;
	}
	public int getBalance() 
	{
		return balance;
	}
	public void setBalance(int balance) 
	{
		this.balance = balance;
	}
	public String getCustomerName() 
	{
		return customerName;
	}
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public int getPhoneNumber() 
	{
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}
	
	
}
