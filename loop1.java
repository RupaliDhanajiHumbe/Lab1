package main;

import java.util.Scanner;

public class loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		for(int i=1 ;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
	}

}
