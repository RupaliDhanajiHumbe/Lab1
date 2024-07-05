package main;
import java.util.Scanner;

public class loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		for(int i=5;i>=0;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}

		}

	}
