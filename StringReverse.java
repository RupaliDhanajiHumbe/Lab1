package main;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reverse="";
	      Scanner s=new Scanner(System.in);
	      System.out.println("enetr the String=");
	      String str=s.next();
	      for(int i=0;i<str.length();i++)
	      {
	    	   reverse =reverse +str.charAt(i);
	      }
	      System.out.println("Reverse String="+reverse);
		
	}

}
