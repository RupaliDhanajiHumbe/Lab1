package main;

interface Drawable3
{
void draw1();

static int cube(int x)
  {
	return x*x*x;
  }
}
public class interface_cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drawable3 d1=()->System.out.println("cube");
	
		d1.draw1();
	}

}
