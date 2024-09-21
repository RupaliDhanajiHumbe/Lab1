package Regex;

import java.util.regex.Pattern;

public class regexmode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Pattern.matches("\\d{3}","123"));  //any digit  0-9
		System.out.println(Pattern.matches("\\d{3}","12"));
		System.out.println(Pattern.matches("\\d{3}","abc"));
		System.out.println(Pattern.matches("\\D{1}","&"));  //any non digit
		System.out.println(Pattern.matches("\\D{2}","&"));
		System.out.println("");
		
		System.out.println(Pattern.matches("\\s","\n")); //any whitespace char \t\n\f\r\xOB
		System.out.println(Pattern.matches("\\s","abc"));
		System.out.println(Pattern.matches("\\S","\\s"));  //any non-whitespace char
		System.out.println("");
		
		System.out.println(Pattern.matches("\\w","5")); // any word character  a-z A-Z 0-9
		System.out.println(Pattern.matches("\\w","*"));
		System.out.println(Pattern.matches("\\W","*")); //any non-word character
		System.out.println(Pattern.matches("\\W","2"));
		System.out.println("");
	}

}
