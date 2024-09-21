package MultiProcess;

public class ThreadAvgSqu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int sum=0;
		 for(int i=1;i<=50;i++)
		 {
			 sum+=i;	 
		 }
		 double average=(double)sum/50;
		 System.out.println("Average of number="+average);
		 Thread t1=new Thread();
		 t1.start();
		 
		 
		 int[] arr= {10,15,20,25,30};
		 for(int number:arr)
		 {
		  int num=number*number;	 
		
		 System.out.println("Square of number arr="+num);
		 }
		 Thread t2=new Thread();
		 t2.start();
	}

}
