package main;

import java.util.Scanner;
public class String_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String 1st=");
		String str=s.nextLine();
		String[] arr1=str.split(" ");
		String temp=" ";
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i].length()<arr1[j].length())
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		for(String name:arr1)
		{
			System.out.println(name);
		}
      
	}
	
}