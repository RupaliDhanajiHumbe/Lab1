package main;
import java.util.Scanner;
import java.util.BitSet;

public class String_replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="bat-ball";
		String str2=" ";
		String str3="";
		String str4="Play";
		System.out.println(str2.isEmpty());
		System.out.println(str3.isEmpty());
		System.out.println(str1.replace('b','c'));
		System.out.println(" ");
		
		
		String text="Java is Programming Language";
		System.out.println(text.toLowerCase());
		System.out.println(text.toUpperCase());
		System.out.println(text.indexOf("Programming"));
		System.out.println(" ");
		
		
		System.out.println(str1.concat(str4));
		System.out.println(str1+str4);
		System.out.println(" ");
		
		
		
	}

}
