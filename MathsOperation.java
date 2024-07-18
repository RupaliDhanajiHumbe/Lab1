package main;

import java.util.Scanner;

public class MathsOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner s=new Scanner(System.in);
		
	    System.out.println("Enter the two number and Sign=");
	    int num1= s.nextInt(); 
	    int num2= s.nextInt(); 
	    String sign= s.next(); 
	    if(sign.equals("+"))
	    {
		System.out.println(num1+num2);
	    }
	    else if(sign.equals("-"))
	    {
		System.out.println(num1-num2);
	    }
	    else if(sign.equals("*"))
	    {
		System.out.println(num1*num2);
	    }
	    else if(sign.equals("%"))
	    {
		System.out.println(num1%num2);
	    }
	    else if(sign.equals("/"))
	    {
		System.out.println(num1/num2);
	    }
	}

}