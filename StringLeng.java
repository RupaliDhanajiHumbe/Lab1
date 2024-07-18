package main;

public class StringLeng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="qwerrthytuyiytgfdgefr";
		System.out.println(text.length());
		
		String s1="ram";  //StringConstant poot
		String s2="ram";
		System.out.println(s1.equals(s2));
		
		String b1=new String("Java");   //heap memory
		String b2=new String("Java");
		System.out.println(b1.equals(b2));
		
		StringBuffer sb1=new StringBuffer("Anudip");
		StringBuffer sb2=new StringBuffer("Anudip");
		System.out.println(sb1.equals(sb2));
		
		String a1="Hello";
		String a2="Hello";
		//String a2=.concat("world");
		System.out.println(a1==a2);
	}
}