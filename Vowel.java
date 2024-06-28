package main;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner s=new Scanner(System.in);
	    System.out.println("enter the letters of Alphabets=");
	     String var=s.next();
	    
	    if(var.charAt(0)=='a' || var.charAt(0)=='e' || var.charAt(0)=='i' || var.charAt(0)=='o' || var.charAt(0)=='u' )
	    {
	    System.out.println("Indicating that the entered letter is a vowel");
	    }
	    
	    else if(var.charAt(0)=='y')
	    	
	    {
	      System.out.println("Indicating that sometimes y is vowel and sometime y is a consonant");
	    }
	    else
	    {
	    System.out.println("Indicating that the entered letter is a consonant");
	    }

	}

}
