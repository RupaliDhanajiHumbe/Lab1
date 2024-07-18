package main;

import java.util.Scanner;

import main.Enum.volumn;

public class Enum1 {
	enum volumn
	{
		LOW,
		MEDIUM,
		HIGH
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner s=new Scanner(System.in);
		   String name=s.next();
		   
			volumn v1=volumn.valueOf(name);
			    switch(v1)
			    {
			    case LOW-> System.out.println("This is LOW");
			    
			    case MEDIUM-> System.out.println("This is MEDIUM");
			    
			    case HIGH-> System.out.println("This is HIGH");
	     }

     }
}

