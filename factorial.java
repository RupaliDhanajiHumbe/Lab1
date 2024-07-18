package main;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner s=new Scanner(System.in);
	    System.out.println("Enter the number=");
	    int num1= s.nextInt(); 
	    int result=1;
	    for(int i=1;i<=num1;i++)
	    {
	    	result=result*i;
	    }
	    System.out.println("Factorial="+result);
	}

}
