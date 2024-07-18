package main;
 
public class StringUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		/*Scanner s=new Scanner(System.in);
		System.out.println("Please enter the string=");
		String str=s.nextLine();*/
		
		String str="Java is Programming Language";
		int uppercount=0,lowercount=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				++uppercount;
			}
			else if(Character.isLowerCase(str.charAt(i)))
			{
				++lowercount;
				
			}
		}
		System.out.println("Upper character is="+uppercount);
		System.out.println("Lower character is="+lowercount);
	}

}
