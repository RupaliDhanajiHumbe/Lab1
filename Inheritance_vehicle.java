package main;

class Vehicle
{
	String brand="Maruti_Suzuki";
	int  model=2016;
	int year=2024;
	
	void drive()
	{
		System.out.println("Brand="+brand+" ");
		System.out.println("Model="+model+" ");
		System.out.println("Year="+year);
	}
	
}
class car extends Vehicle
{
	String Colour="Black";
	
	void honk()
	{
		System.out.println("Colour="+Colour);
	}
}

public class Inheritance_vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car c=new car();
		c.drive();
		c.honk();
		
	}

}
