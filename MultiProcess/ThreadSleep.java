package MultiProcess;

public class ThreadSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable task=() ->{ 
			for(int i=0;i<=5;i++)
			{
			System.out.println(Thread.currentThread().getName()+ " -Count"+i);
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(Thread.currentThread().getName());
			}
		};
		Thread thread1=new Thread(task," Thread 1");
		Thread thread2=new Thread(task," Thread 2");
	}

}
