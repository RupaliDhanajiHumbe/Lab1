package main;

import java.util.*;

public class AreaInAcers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner s= new Scanner(System.in);        
        System.out.print("Enter the length of the field in feet:- ");
        double length = s.nextDouble();
        
        System.out.print("Enter the width of the field in feet:- ");
        double width = s.nextDouble();
        
        double areaInSquareFeet = length * width;

        double areaInAcres = areaInSquareFeet / 43560;
        
        System.out.println("The area of the field is " + areaInAcres + " acres.");
        
	}

}
