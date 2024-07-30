package main;

class student2
{
	int rollNo;
	String name;
	float fee;
	
	student2()
	{
		
	System.out.println("default constructor..");	
	}
	
	student2(int rollNo,String name,float f)
	{
		this();
		this.rollNo=rollNo;
		this.name=name;
		fee=f;
	}
	void show()
	{
		System.out.println("This detail of student");
	}
	void display()
	{
		this.show();
		System.out.println("RollNo="+rollNo+" "+"Name="+name+" "+"Fee="+fee);
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student2 s=new student2(101,"Ganesh",2500);
		s.display();
		student2 s1=new student2(102,"rahul",3000);
		s1.display();
	}

}
