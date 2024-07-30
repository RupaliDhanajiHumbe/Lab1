package A;

interface PaymentMethod 
 {
	    void makePayment(double amount);
	    void printReceipt();
  }

class CreditCardPayment implements PaymentMethod 
  {
	    @Override
		public void makePayment(double amount) 
	    {	
	        System.out.println("Payment of " + amount + " made using Credit Card.");
	    }

	    @Override
	    public void printReceipt() 
	    {
	        System.out.println("Credit Card Payment Receipt.");
	    }
	}

class PayPalPayment implements PaymentMethod
   {
	    @Override
	    public void makePayment(double amount) 
	    {
	        System.out.println("Payment of " + amount + " made using PayPal.");
	    }

	    @Override
	    public void printReceipt() 
	    {
	        System.out.println("PayPal Payment Receipt.");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
        PaymentMethod c = new CreditCardPayment();
        PaymentMethod p = new PayPalPayment();

        PaymentMethod[] PM = { c, p };

        double[] amounts = { 100.0, 200.0 }; 

        for (int i = 0; i < PM.length; i++) 
        {
            PM[i].makePayment(amounts[i]);
            PM[i].printReceipt();
            System.out.println();
	   }
    }
}