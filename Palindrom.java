package main;
import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Scanner s=new Scanner(System.in);
		System.out.println("Enter the String=");
		String str;*/
		
		String str1="malayalam";
		String reverse="" ;
			for(int i=str1.length()-1;i>=0;i--)
			{
				reverse =reverse + str1.charAt(i);
				
			}
		System.out.println(reverse);
		if(reverse.equals(str1))
		{
			System.out.println("Palindrom");
		}
	  }	
  }