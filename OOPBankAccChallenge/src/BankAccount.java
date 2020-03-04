
public class BankAccount 
{
	private int number;
	private int balance;
	private String customerName;
	private String email; 
	private int phoneNumber;
	
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
	public int getNumber() 
	{
		return number;
	}
	public void setNumber(int number)
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
