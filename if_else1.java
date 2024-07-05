package main;

import java.util.Scanner;

public class if_else1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println(" Please enter the temp=");
		int temp=s.nextInt();
		if(temp<=100)
		{ 
		System.out.println("Green LED is on");
		}
		else if(100 < temp && temp < 200)
		{
			System.out.println("yellow LED is on");
		}
		else if(temp>=200)
		{
			System.out.println("Red LED is on");
		}

	}

}
