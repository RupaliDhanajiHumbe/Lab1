package main;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner s=new Scanner(System.in);
		System.out.println(" Please enter the marks=");
		
		float sub1=s.nextFloat();
		float sub2=s.nextFloat();
		float sub3=s.nextFloat();
		float sub4=s.nextFloat(); 
		float sub5=s.nextFloat();
	    
	    float total=sub1+sub2+sub3+sub4+sub5;
	    float Precentage=((total/500)*100);
	    System.out.println("Persentage="+Precentage+"%");
	    
	    if(Precentage >=90 && Precentage <= 100)
	    {
	       System.out.println("Grade A");
	    }
	    else if(Precentage>=70 || Precentage < 90)
	    {
	       System.out.println("Grade B");
	    }

	    else if(Precentage>=60 || Precentage < 80)
	    {
	       System.out.println("Grade C");
	    }
	    else if(Precentage>=50 || Precentage < 60)
	    {
	       System.out.println("Grade D");
	    }
	    else 
	    {
	       System.out.println("Fail");
	    }

		
	}

}
