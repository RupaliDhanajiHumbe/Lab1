package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");
        boolean c=m.matches();
        System.out.println(c);
        
        boolean c1=Pattern.matches(".s", "bs");
        System.out.println(c1);
		
        boolean c2=Pattern.matches("..s", "abs");
        System.out.println(c2);
        
        System.out.println(Pattern.matches(".s", "bst"));
        System.out.println(Pattern.matches(".s", "baas"));
        System.out.println(Pattern.matches("..s", "bs"));
		
	}

}
