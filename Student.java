package main;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner s=new Scanner(System.in);
	    System.out.println("enter the value of 5 subject");
	    float a=s.nextInt();
	    float b=s.nextInt();
	    float c=s.nextInt();
	    float d=s.nextInt(); 
	    float e=s.nextInt();
	    
	    float total=a+b+c+d+e;
	    float Precentage=((total/500)*100);
	    System.out.println("Persentage="+Precentage+"%");
	    if(Precentage>90)
	    {
	       System.out.println("Grade A");
	    }
	    else if(Precentage>70)
	    {
	       System.out.println("Grade B");
	    }

	    else if(Precentage>50)
	    {
	       System.out.println("Grade C");
	    }
	    else 
	    {
	       System.out.println("Fail");
	    }

		

	}

}
