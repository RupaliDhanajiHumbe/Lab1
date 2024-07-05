package main;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
	    System.out.println("Enter the weight=");
	    int weight=s.nextInt();
	    System.out.println("Enter the hright=");
	    int height_in_meters =s.nextInt();
	    
	    int BMI;
	    BMI = weight / (height_in_meters * height_in_meters);
	    if(BMI < 18.5)
	    {
	    	 System.out.println("Underweight");
	    }
	    else if(18.5 <= BMI && BMI < 24.9)
	    {
	    	 System.out.println("Healthy");
	    }
	    else if(25 <= BMI && BMI< 29.9)
	    {
	    	System.out.println("Overweight");
	    }
	    else if(BMI >= 30)
         {
        	 System.out.println("Obese");
         }
	}

}
