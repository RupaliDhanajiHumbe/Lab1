package main;

public class SumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1325;
		int sum=0;
		
		while(n>0)
		{
			int r=n%10;
		      sum=sum+r;
		      n=n/10;
		}
		int add=0;
		while(sum>0)
		{
			int r1=sum%10;
		      add=add+r1;
		      sum=sum/10;
		}
		System.out.println("Sum="+add);
	}

}
