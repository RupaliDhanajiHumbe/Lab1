package main;

import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		for(int i=3 ;i>0;i--)
		{
			for(int j=i;j>=0;j--)
			{
				System.out.print("*    ");
			}
			System.out.println(" ");
		}
	}

}
