package MultiProcess;

public class MultiThread1 extends Thread {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		 for(int i=1;i<=1000;i++)
		 {
			 sum+=i;	 
		 }
		 System.out.println(sum);
		 Main1 obj=new Main1();
		 Thread t1=new Thread(obj);
		 t1.start();
		 t1.start();
		 new Thread(new Main1()).start();
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("printing record.."+i);
		}
	}
	
}