package MultiProcess;

class TaskThread extends Thread
{
	private String threadName;
	TaskThread(String name){
		this.threadName=name;
	}
	@Override
	public void run() {
		System.out.println(threadName + " started .");
		for(int i=1;i<=50;i++) {
			System.out.println(threadName +" is working .." + i);
			
		}
		System.out.println(threadName + " finished .");
	}
}
public class JoinMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TaskThread thread1=new TaskThread("Thread 1");
		TaskThread thread2=new TaskThread("Thread 2");
		TaskThread thread3=new TaskThread("Thread 3");
		thread1.start();
		thread2.start();
		thread3.start();
		
		/*try {
			thread1.join();
			System.out.println((thread1.threadName +" has completed"));

			thread2.join();
			System.out.println((thread2.threadName +" has completed"));
			
			thread3.join();
			System.out.println((thread3.threadName +" has completed"));
		}*/
	}

}
