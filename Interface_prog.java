package main;

interface printable
{
	void print();
}
interface drawable
{
	void draw();
}
class  program implements printable, drawable 
{
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw method");
		}

	
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print method");
	}
}

public class Interface_prog  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		program m=new program();
		m.draw();
		m.print();
	   }
   }	