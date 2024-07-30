package main;

class bank
{
	String colour="Black";
	public float rateofIntrest() 
	{
		return 0.0f;
	}
}
class HDFC extends bank
{
	String colour="White";
	public float rateofIntrest() 
	{
		return 7.5f;
	}
}
class ICICI extends bank
{
	public float rateofIntrest() 
	{
		return 13.4f;
	}
}

public class MethodOverriding {

	public static void main(String arg[])
	{
		bank b=new bank();
		System.out.println(b.rateofIntrest());
		
		bank b1=new HDFC();
		System.out.println(b1.rateofIntrest());
		System.out.println(b1.colour);
	}
}
