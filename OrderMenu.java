package A;

import java.util.Scanner;

public class OrderMenu {

	public void display()
	{
		int PizzaPrice=200;
		System.out.println("Enter the name and quantity=");
		Scanner s=new Scanner(System.in);

		int id=s.nextInt();
		String name=s.next();
		int Quantity=s.nextInt();
		
		System.out.println("Id="+id);
		System.out.println("Name="+name);
		System.out.println("Quantity="+Quantity);
		PizzaPrice=Quantity*PizzaPrice ;
		System.out.println("Price="+PizzaPrice); 
	}

	public void show()
	{
		int BurgerPrice=80;
		System.out.println("Enter the name and quantity=");
		Scanner s=new Scanner(System.in);

		int id=s.nextInt();
		String name=s.next();
		int Quantity=s.nextInt();
		BurgerPrice=Quantity*BurgerPrice ;
		System.out.println("Price="+BurgerPrice);
		
	}
	public void display1()
	{
		int CoffiePrice=70;
		System.out.println("Enter the name and quantity=");
		Scanner s=new Scanner(System.in);

		int id=s.nextInt();
		String name=s.next();
		int Quantity=s.nextInt();
		
		CoffiePrice=Quantity*CoffiePrice ;
		System.out.println("Price="+CoffiePrice);
		System.out.println(" ");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated

		OrderMenu p1=new OrderMenu();
		p1.display();	
		OrderMenu p2=new OrderMenu();
		p2.show();
		OrderMenu p3=new OrderMenu();
		p3.display1();

   }
}