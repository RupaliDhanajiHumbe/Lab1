package main;

class Polygon
{
	void draw()
	{
	System.out.println("Polygon class...");
	}
}
class Rectangle extends Polygon
{
	void draw()
	{
		System.out.println("Rectangle class..");
	}
}

class Traingle extends Polygon
{
	void draw()
	{
		System.out.println("Traingle class..");
	}
}
public class Polymorpisum_Polygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polygon p=new Polygon();
		p.draw();
		Rectangle p1=new Rectangle();
		p1.draw();
		Polygon p2=new Traingle();
		p2.draw();
		
	}

}
