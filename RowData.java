package main;

import java.util.Scanner;

public class RowData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter the roll number=");
	     int RollNum=s.nextInt();
	     String Result=(RollNum % 4==0) ? "Saffire":
	    	 (RollNum % 4==3 || RollNum==3) ? "Rubby":
	         (RollNum % 4==2 || RollNum==2) ? "Dimand":"Perl";
	     System.out.println(Result);
	}

}
