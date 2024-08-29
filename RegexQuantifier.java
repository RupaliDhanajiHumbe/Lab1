package Regex;

import java.util.regex.Pattern;

public class RegexQuantifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Pattern.matches("[abc]?","a")); //x occurs once or not at all
		System.out.println(Pattern.matches("[abc]?","aaa")); 
		System.out.println(Pattern.matches("[abc]?"," "));
		System.out.println(" ");
		
		System.out.println(Pattern.matches("[abc]+","a"));   //x occurs once or more times
		System.out.println(Pattern.matches("[abc]+","aaa")); 
		System.out.println(Pattern.matches("[abc]+","abbbcc")); 
		System.out.println(" ");
		
		System.out.println(Pattern.matches("[abc]*","a"));   //x occurs zero or more times
		System.out.println(Pattern.matches("[abc]*"," ")); 
		System.out.println(Pattern.matches("[abc]*","abbbcc"));
		System.out.println(" ");
		
		System.out.println(Pattern.matches("[abc]+","a"));   //x occurs once or more times
		System.out.println(Pattern.matches("[abc]+","aaa")); 
		System.out.println(Pattern.matches("[abc]+","abbbcc")); 
		System.out.println(" ");
		
		
	}

}
