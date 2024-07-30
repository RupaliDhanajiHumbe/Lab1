package main;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polymorphism p=new Polymorphism();
		p.add(12,23);
		
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
		
	}
         
	}