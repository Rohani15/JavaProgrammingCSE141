package sectionSix;

public class bankAccount 
{
	private String number;
	private double balance; 
	private String customer;
	private String name;
	private String email;
	private String phoneNumber;
	
	public bankAccount()
	{
		this("12345", 2.50, "default name", "default address", "default email", "default phone");
		//called once to initialize the obj you're creating
		System.out.println("empty constructor called: ");
	}
	public bankAccount(String number, double balance, String customer, 
			String name, String email, String phoneNumber)
	{
		this.number = number;
		this.balance = balance; 
		this.customer = customer;
		this.name = name;
		this.email = email; 
		this.phoneNumber = phoneNumber; 
	}
	//ALLOW CUTOMERS TO DEPOSIT FUNDS(INCREMENT THE BALANCE FIELD)
	public void deposit(double depositAmount)
	{
		this.balance += depositAmount; //(+=) adds to the balance while (=) will replace it //[(balance) = (balance + withdrawalamount)]
		System.out.println("deposit of " + depositAmount + " made. new balance " + this.balance);
	}
	//ALLOW CUSTOMERS TO DEPOSIT FUNDS(SHOULD DECREMENT THE BALANCE FIELD
	public void withdrawal(double withdrawalAmount)
	{
		if(balance - withdrawalAmount < 0) // if balance minus withdrawal amout is less than 0 then.....
		{
			System.out.println("only " + balance + " is available not processed");
		}
		else
		{
			balance -= withdrawalAmount; //(balance) = (balance - withdrawal amount) 
			System.out.println("withdrawl of " + withdrawalAmount + " processed. remaining balance " + this.balance);
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
	
	public double getBalance() 
	{
		return balance;
	}
	
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	
	public String getCustomer() 
	{
		return customer;
	}
	
	public void setCustomer(String customer)
	{
		this.customer = customer;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public String getPhoneNumber() 
	{
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}



}








