package MultiProcess;

public class Runnable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r1=new Runnable() {
			public void run() {
				System.out.println("thread0 is running");
			}
		};
		
		
		 Thread t1=new Thread(r1);
		 t1.start();
		 int sum=0;
		 for(int i=1;i<=100;i++)
		 {
			 sum+=i;	 
		 }
	}

}
