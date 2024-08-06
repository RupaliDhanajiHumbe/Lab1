package B;

import A.AccessModifier;

class C extends AccessModifier
{
	int y=25;
	
	void draw()
	{ 
		
		System.out.println("Drawing draw");
	}
}
public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		C c1=new C();
		c1.display();
		c1.draw();
		//System.out.println(c1.n);
	}

}
