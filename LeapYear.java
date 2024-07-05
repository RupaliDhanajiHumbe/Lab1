package main;

import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println(" Please enter the year=");
		int year=s.nextInt();
		if(year%100==0)
		{
			if(year%400==0)
			{
			System.out.println("This centurial year is a lear year");	
		   }
		else if(year%4==0)
		{
			System.out.println("This is the leap year");
		}
		else 
		{
			System.out.println("Tis is  not a leap year");
		}

	}
}

} 
