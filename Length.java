package main;

import java.util.Scanner;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           

		Scanner s=new Scanner(System.in);
	    System.out.println("enter the lengthnof the side=");
	     int a=s.nextInt();
	     int b=s.nextInt();
	     int c=s.nextInt();
	     if(a==b && b==c && c==a)
	     {
	            System.out.println("The equilateral tringle ");
	      }
	     else if(a==b || b==c || a==c)
	     {
	    	 System.out.println("The isosceles tringle ");
	     }
	     else
	     {
	    	 System.out.println("The scalene tringle ");
	     }
	}

}
