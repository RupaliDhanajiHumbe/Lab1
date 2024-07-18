package main;

public class Enum {

	enum volumn
	{
		LOW,
		MEDIUM,
		HIGH
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		volumn v1=volumn.MEDIUM;
		    switch(v1)
		    {
		    case LOW-> System.out.println("This is LOW");
		    
		    case MEDIUM-> System.out.println("This is MEDIUM");
		    
		    case HIGH-> System.out.println("This is HIGH");
	    }
	}
}
