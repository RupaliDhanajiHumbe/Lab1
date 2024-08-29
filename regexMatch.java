package Regex;

import java.util.regex.Pattern;

public class regexMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Pattern.matches("[^abc]","d"));  //not expected in this letter
		System.out.println(Pattern.matches("[^abc]","c"));
		System.out.println("");
		
		System.out.println(Pattern.matches("[abc]","a"));  //expected in this letter
		System.out.println(Pattern.matches("[abc]","d"));
		System.out.println("");
		
		System.out.println(Pattern.matches("[abc]+",""));
		System.out.println("");
		
		System.out.println(Pattern.matches("[a-d[m-p]]","z"));
		System.out.println(Pattern.matches("[a-d[m-p]]","c"));
		System.out.println("");
		
		System.out.println(Pattern.matches("[a-z[^m-p]]","z"));
		System.out.println(Pattern.matches("[a-d[^m-p]]","c"));
		System.out.println("");
		
		System.out.println(Pattern.matches("[a-z&&[def]]","d")); //both condition true
		System.out.println(Pattern.matches("[a-z&&[def]]","j"));
		System.out.println("");
		
		System.out.println(Pattern.matches("[a-z&&[^bc]]","d"));  //a to z all also not b , c both are check
		System.out.println(Pattern.matches("[a-z&&[^bc]]","c"));
		System.out.println("");
	}

}
