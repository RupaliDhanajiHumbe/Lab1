package main;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 double tax = 0;
		
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter the Employee Name=");
	    String name=s.nextLine();
	    System.out.println("enter the annual income=");
	    double income=s.nextDouble();

        
	    System.out.println("Employee name="+name);
	    System.out.println("Employee income="+income);

        if(income <= 250000) 
        {
        	System.out.println("0");
        } 
        else if(income <= 500000) 
        {
        	tax=tax + (0.1 *(income - 250000));
        	System.out.println("Income Tax="+tax);
        }
        else if(income <= 1000000) 
        {
        	tax=tax+30000 +(0.2 * (income - 500000));
        	System.out.println("Income Tax=" +tax);
        } 
        else
        {
        	tax=tax+50000 +( 0.3 * (income - 1000000));
        	System.out.println("Income Tax="+tax);
        }
	   
       
	}

}
