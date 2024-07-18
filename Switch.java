package main;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner s=new Scanner(System.in);
		
	    System.out.println("Enter the Month=");
	    String Month= s.next(); 
	    switch(Month)
	    {
	    case "Jan"-> System.out.println("This is January");
	    
	    case "Feb"-> System.out.println("This is Febrauray");
	    
	    case "March"-> System.out.println("This is March");
	    
	    case "April"-> System.out.println("This is April");
	    
	    case "May"-> System.out.println("This is May");
	    
	    case "June"-> System.out.println("This is June");
	    
	    case "July"-> System.out.println("This is July");
	    }*/
	    
        Scanner s=new Scanner(System.in);
		
	    System.out.println("Enter the Month=");
	    String Month= s.next();
	    switch(Month)
	    {
	    case "Jan":
	    	System.out.println("This is January");
	    
	    case "Feb":
	    	System.out.println("This is Febrauray");
	    
	    case "March":
	    	
	    	System.out.println("This is March");
	    
	    case "April":
	    	System.out.println("This is April");
	    
	    case "May":
	    	System.out.println("This is May");
	    
	    case "June":
	    	System.out.println("This is June");
	    
	    case "July":
	    	System.out.println("This is July");
	    }
	}
}

/*Enter the Month=
Feb
This is Febrauray
This is March
This is April
This is May
This is June
This is July*/

