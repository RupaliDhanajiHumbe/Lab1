package main;

import java.util.Scanner;

public class area {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner s=new Scanner(System.in);
			System.out.println("enter value of radius,height=");
			int r=s.nextInt();
			double h=s.nextDouble();
			double V=3.14*r*r*h;
			System.out.println("volume of cyc="+V);
			
		}

	}