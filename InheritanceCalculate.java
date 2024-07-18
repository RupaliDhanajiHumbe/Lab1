package main;
class Calculate
{
	int a=10,b=20;
	void add()
	{
		int x=a+b;
		System.out.println("Add="+x);
	}
}
class Calculate1 extends Calculate
{
	int c=30,d=10;
	void sub()
	{
		int y=c-d;
		System.out.println("Sub="+y);
	}
}
class Calculate2 extends Calculate1
{
	int e=5,f=10;
	void multi()
	{
		int z=e*f;
		System.out.println("Multi="+z);
	}
}

public class InheritanceCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculate2 c=new Calculate2();
		c.multi();
		c.sub();
		c.add();
	}

}
