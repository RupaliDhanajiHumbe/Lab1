package main;

import java.util.Scanner;

public class foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] car= {"swift","Mazda"};
		
		for(int i=0;i<car.length;i++)
		{
			
			System.out.println(car[i]);
	}
		System.out.println(" ");
		
		
		
		
		for(String name:car)
		{
			System.out.println(name);
		}
		System.out.println(" ");
		
	}
}
