package main;

public class methodOverloading {
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		methodOverloading s=new methodOverloading();
		s.add(10,20);
		s.add(20,30,40);
	}

}
