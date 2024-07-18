package main;

public class methodVowel {
	
	public static void countVowel(String str)
	{
		int vowel=0;
		int consonant=0;
		for(int i=0;i<str.length();i++)
		{
		if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
		{
			vowel++;
		}
		else
		{
			consonant++;
		}
	  }

		System.out.println("Vowel="+vowel);
		System.out.println("Consonant="+consonant);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		countVowel("Rupali");
		
	}

}
