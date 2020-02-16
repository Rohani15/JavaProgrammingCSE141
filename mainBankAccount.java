package sectionSix;

public class mainBankAccount 
{

	public static void main(String[] args) 
	{
		bankAccount bobsAccount = new bankAccount(); //("12345", 0.0, "bob", 
				//"name", "gmail", "123456789");  
		
		//calling the special method that creates the class. purpose is to physically create the object from the class for us 
		bobsAccount.setNumber("12345");
		bobsAccount.setBalance(0.00);
		bobsAccount.setEmail("gmail");
		bobsAccount.setPhoneNumber("12345677");
		bobsAccount.withdrawal(100.0);
		System.out.println(bobsAccount.getNumber());
		
		bobsAccount.deposit(50.0);
		bobsAccount.withdrawal(100.0);

	}
	

}
