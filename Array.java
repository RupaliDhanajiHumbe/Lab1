package main;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String[] color= {"red","Yellow","Blue","White"};
		//String tempString="";
		//for(int i=0;i<color.length;i++)
		//{
			
			int[] number= {20,34,12,67,45};
			int max=number[0];
			for(int i=0;i<number.length;i++)
			{
				if(number[i]>max)
				{
					max=number[i];
				}
			}
			System.out.println("Maximun number="+max);
			
			
			
			int[] num= {20,34,12,67,45};
			int small=number[0];
			for(int i=0;i<number.length;i++)
			{
				if(number[i]<small)
				{
				 small=num[i];
				}
			}
			System.out.println("Small number="+small);
	
	}
	
	}