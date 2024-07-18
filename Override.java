package main;

class tiger
{ 
	String colour="Black";
	void eat()
	{
		System.out.println("eating..");
		}
}
class Mavu extends tiger
{
	void eat()
	{
		String colour="White";
		System.out.println("drinking milk..");
		System.out.println("drinking milk..");
		System.out.println(super.colour);
		super.eat();
		}
}
public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Mavu d=new Mavu();
		d.eat();
	}

}
