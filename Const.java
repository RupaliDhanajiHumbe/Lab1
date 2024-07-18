package main;

public class Const {
	
	int x;
	Const(int x)
	{
		this();
		x=x;
		System.out.println("I am parameterized constructor"+x);
	}
	Const()
	{
		System.out.println("I am default constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Const c=new Const(20);
		
	}

}
