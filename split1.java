package main;

public class split1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="java is fun";
		String str2="Python is easiest language";
		 System.out.println(str1.substring(0,4));
		 System.out.println(str2.substring(0,6));
		 System.out.println(" ");
		 
		 
		 String str3="    java is Programming Language   ...";
		 System.out.println(str3.trim());
		 System.out.println(str3);
		 System.out.println(" ");
		 
		 
		 String str4="Python is easiest Programming language";
		boolean result=str4.contains("Python");
		boolean result1=str4.contains("python");
		System.out.println(result);
		System.out.println(result1);
		if(str4.charAt(0)=='P');
		{
			System.out.println("true");
		}
		
	}

}
