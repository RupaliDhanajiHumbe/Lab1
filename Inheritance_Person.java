package main;

class Person
{ 
	String name="Ganesh";
	int age=21;
 void speak()
	{
		System.out.println("Name="+name+" , ");
		System.out.println("Age="+age+" , ");
	}
}
class Student1 extends Person 
{
	String grade="A";
	void study()
	{
		System.out.println("Grade"+grade);	
	}
}
public class Inheritance_Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 s=new Student1();
		s.speak();
		s.study();
	}

}
