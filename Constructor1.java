package main;

public class Constructor1 {
	
	int id;
	String name;
	String email;
	int marks;
	
	public Constructor1(int i,String n,String e,int m)
	{
		id=i;
		name=n;
		email=e;
		marks=m;
	}
	void display()
	{
		System.out.println("id="+id+"name="+name+"Email="+email+"Marks="+marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor1 c1=new Constructor1(11,"Ram","Ram@gmail.com",67);
		c1.display();
		Constructor1 c2=new Constructor1(12,"Sham","Sham@gmail.com",76);
		c2.display();
	}

}
