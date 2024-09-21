package MultiProcess;

public class SleepMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r1=()->
		{
			for(int i=0;i<50;i++)
			{
				System.out.println("thread0"+i);
				try {
					Thread.sleep(20);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
	
		 Thread t1=new Thread(r1);
		 t1.start();
		 for(int i=1;i<=50;i++)
		 {
			 System.out.println("Main"+i);
			 try {
					Thread.sleep(20);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
		 }
	}

}
