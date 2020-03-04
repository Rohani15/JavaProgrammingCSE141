
public class Main 
{

	public static void main(String[] args) 
	{
		BankAccount bobsAccount = new BankAccount("1223", 0, "bob", "email@gmail", 12345678);
		bobsAccount.setNumber("12344");
		bobsAccount.setBalance(0);
		bobsAccount.withdrawFunds(100.0);
		
		bobsAccount.depositFunds(50.0);
		bobsAccount.withdrawFunds(51.0); 
		
		//BankAccount timsAccount = new BankAccount("1234", "tim" "tim@gmail", 1234);
	}

}
