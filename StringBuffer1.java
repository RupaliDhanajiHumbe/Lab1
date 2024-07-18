package main;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new StringBuffer("teacher").replace(0, 1, "ch").replace(4,6,"t").toString());
		System.out.println(new StringBuffer("SCJP6EXAM").deleteCharAt(5).substring(3,5));
		
	}

}
