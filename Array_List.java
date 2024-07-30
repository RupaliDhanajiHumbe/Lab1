package main;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> number=new ArrayList<>();
		number.add(5);
		number.add(10);
		number.add(28);
		number.add(23);
		
		
		List<String> colorString=new ArrayList<>();
		colorString.add("red");
		colorString.add("Blue");
		colorString.add("Purple");
		colorString.add("Pink");
		for(String s: colorString)
		{
			System.out.println(s);
		}
		System.out.println(" ");
		
		colorString.forEach(
				(s1)->System.out.println(s1)
		   );
		System.out.println(" ");
				
		for(Integer n:number)
		{
			
			if(n%2==0)
			System.out.println("Even number"+n);
		}
		System.out.println(" ");
		
		number.forEach(
				(n1)->
				{
					if(n1%2!=0)
					{
					 System.out.println("odd number="+n1);
				}
		   }
    	 );
	}
}