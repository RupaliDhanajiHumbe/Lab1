package main;

import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       

		Scanner s=new Scanner(System.in);
	    System.out.println("enter the number");
	     int a=s.nextInt();
		String result=(a>=40)?"Status pass":"status Fail";
		System.out.println(result);
	}

}
