package main;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println(" Please enter the Number=");
		int Num=s.nextInt();
		if(Num%2==0)
		{ 
		System.out.println("Even number");
		}
		else
		{
			System.out.println("odd Number");
		}
	}

}
