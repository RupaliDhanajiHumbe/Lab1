package B;

import java.util.Scanner;

public class excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number=");
		int num=s.nextInt();
		try
		{
			checkNumber(num);
		}
		catch(NegativeNumberException e)
		{
			e.printStackTrace();	
		}
	}
	public static void checkNumber(int num)throws NegativeNumberException
	{
		  if(num<-1)
		  {
			  System.out.println("your number is valid");
		  }
		  else 
		  {
		  throw new NegativeNumberException(" you have enter negative Number");
		  }
		  
	}
}