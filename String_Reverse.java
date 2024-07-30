package main;

import java.util.Scanner;

public class String_Reverse {

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
		System.out.println(" ");
		
		
		
		
		String str4="I am java Student";
		String[] arr2=str4.split(" ");
		String temp1=" ";
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=i+1;j<arr2.length;j++)
			{
				if(arr2[i].length()>arr2[j].length())
				{
					temp1=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp1;
				}
			}
		}
		for(String name1:arr2)
		{
			System.out.println(name1);
		}
		
		
	}

}