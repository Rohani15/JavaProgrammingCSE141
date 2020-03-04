
public class Main 
{

	public static void main(String[] args) 
	{
		BankAccount bobsAccount = new BankAccount();
		bobsAccount.withdrawFunds(100.0);
		
		bobsAccount.depositFunds(50.0);
		bobsAccount.withdrawFunds(51.0); 
	}

}
