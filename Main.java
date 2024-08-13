package A;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void performTransaction(double amount) throws InsufficientFundsException {
        if (amount < 0) {
          
            if (amount * -1 > balance) {
                throw new InsufficientFundsException("Insufficient funds for withdrawal");
            }
            balance += amount;
        } else {
            
            balance += amount;
        }
    }
    public class InsufficientFundsException extends Exception 
    {
    	public InsufficientFundsException(String message) {
            super(message);
        }
    }
   
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 BankAccount account = new BankAccount(1500.0);
		 
		try
		{
            account.performTransaction(1000.0);
            System.out.println("Balance after deposit: " + account.getBalance());
        }
		catch (BankAccount.InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        try 
        {
            account.performTransaction(-700.0);
            System.out.println("Balance after withdrawal: " + account.getBalance());
        } 
        catch (BankAccount.InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        try 
        {
            account.performTransaction(-2000.0);
            System.out.println("Balance after withdrawal: " + account.getBalance());
        } 
        catch (BankAccount.InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Final balance: " + account.getBalance());
		
	}

}
