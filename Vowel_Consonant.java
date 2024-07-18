package main;

public class Vowel_Consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int Vowel=0;
       int Consonant=0;
       String  Str1="anudip";
       for(int i=0;i<Str1.length();i++)
       {
       if(Str1.charAt(i)=='a' || Str1.charAt(i)=='u' || Str1.charAt(i)=='i')
       {
    	   Vowel++;
    	}
    	 
       else if(Str1.charAt(1)=='n' || Str1.charAt(3)=='d' || Str1.charAt(5)=='p')
       {
    	   Consonant++;
    	   
       }
	}
	System.out.println("Vowel="+Vowel);
	   System.out.println("Consonant="+Consonant);
	}
}
