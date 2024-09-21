package MultiProcess;

class Customer
{
	int balance=2000;
	synchronized void withdrow(int amount)
	{
		System.out.println("trying to withdrow money");
		if(this.balance<amount)
		{
			try {
				wait();
				//System.out.println(Thread.currentThread().getState());
			}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			this.balance -=amount;
		}
	synchronized void deposit(int amount){
		System.out.println("deposit the amount");
		this.balance -=amount;
		notify();
	}
}
  
public class WaitNotify1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c=new Customer();
		new Thread() {
		public void run() {
			c.withdrow(2500);
			c.deposit(1500);
		}
		}.start();
	}

}
