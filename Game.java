package main;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int num=1;
		 
		 Scanner s=new Scanner(System.in);
		 System.out.println(" Please enter the alphabets=");
		 String alpha=s.next();
		 
		 if(alpha.charAt(0)=='A' || alpha.charAt(0)=='C' || alpha.charAt(0)=='E' || alpha.charAt(0)=='G')
		 {
		   if(num%2==1 || num<=8)
		   {
			System.out.println("Color box is black");
			num++;
		   }
		   else
		   {
			   System.out.println("Color box is white");
		   }
		 }
		   
		   else if(alpha.charAt(0)=='B' || alpha.charAt(0)=='D' || alpha.charAt(0)=='F' || alpha.charAt(0)=='H')
		   {
			   if(num%2==0)
			   {
				   System.out.println("Color box is white");
			   }
			   else
			   {
				   System.out.println("Color box is black");
			   
			   }
				   
		   }  
	}
}
