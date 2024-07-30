package main;

public class multiNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=1;i<=50;i++)
		{
			if(i%4==0)
			{
				System.out.println("Fizz");
			}

			else if(i%5==0)
			{
				System.out.println("Buzz");
			}

			else if(i%4==0 && i%5==0)
			{
				System.out.println("FizzBuzz");
			}
		}
	}

}
