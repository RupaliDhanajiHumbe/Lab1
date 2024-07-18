package main;

import java .util.*;

public class DigitNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
				
	    System.out.println("Enter the number=");
	    int number= s.nextInt();
	    int count=0;
	    
	   /* while(number>0)
	    {
	    	number=number/10;
	    	++count;
	    }
	    System.out.println("Number of Digit="+count); */
	    
	    
	   do
	    {
	    	number=number/10;
	    	++count;
	    }
	    while(number>0);
	    System.out.println("Number of Digit="+count);
				
				
	}

}

/*Enter the number=
678
Number of Digit=3
*/