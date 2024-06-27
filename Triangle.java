package main;

import java.util.*;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter the angle of triangle=");
	    int a=s.nextInt();
	    
	    if(a>150)
	    {
	    System.out.println("Angle is actute");
	    }
	    else if(a>10 && a<90)
	    {
	    System.out.println("Angle is obtuse");
	    }
	    
	    else if(a==90)
	    {
	    System.out.println("Angle is right");
	    }
	    
	}

}
