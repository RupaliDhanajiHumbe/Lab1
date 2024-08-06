package B;

class InsufficientFundsException extends Exception
{ 
	public InsufficientFundsException(String message)
	{
		super(message);
	}
}

class NegativeAmountException extends Exception 
{
	public NegativeAmountException(String message)
	{
		super(message);
	}
}

class BankAccount
{
	double balance;
	public BankAccount(double balance)
	{
		this.balance=balance;
	}

	public double getBalance()
	{
	 return balance;	
	}
	
void deposit(double amount) throws NegativeAmountException
{
	if(amount <0)
	{
		throw new NegativeAmountException(" you can't deposit negative amount");
	}
	balance=balance+amount;
}

 void withdraw( double amount) throws InsufficientFundsException, NegativeAmountException
 {
	 if(amount <0)
		{
			throw new NegativeAmountException(" you can't withdraw negative amount");
		}
	 if(amount >balance)
	 {
		 throw new InsufficientFundsException("you can withdraw amount");
	 }
	 balance=balance-amount;
 }
}

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount BA=new BankAccount(1500.0);
		
		try
		{
		BA.deposit(1000.0);
		System.out.println("Add balance="+BA.getBalance());
		
		BA.withdraw(700.0);
		System.out.println("new sub balance="+ BA.getBalance());
		
		BA.withdraw(2000.0);
		}
		catch(InsufficientFundsException e)
		{
			System.out.println("Exception="+e.getMessage());
		}
		catch(NegativeAmountException e)
		{
			System.out.println("Exception="+e.getMessage());
		}
		
	}

}