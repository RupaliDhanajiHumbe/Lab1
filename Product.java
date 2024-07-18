package main;

public class Product {
	
	int id;
	String name;
	int Quantity;
	int Price;
	Product(int i,String n,int q,int p)
	{
		id=i;
		name=n;
		Quantity=q;
		Price=p;
	}
	
	public void display()
	{
		System.out.println("Id="+id);
		System.out.println("Name="+name);
		System.out.println("Quantity="+Quantity);
		Price=Quantity*Price ;
		System.out.println("Price="+Price);
		System.out.println(" ");
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Product p1=new Product(101,"Sting",5,25);
		p1.display();
		Product p2=new Product(102,"Sprite",10,100);
		p2.display();
		
		Product p3=new Product(103,"Coco_cola",2,50);
		p3.display();
		
		Product p4=new Product(104,"Mstani",4,70);
		p4.display();
		
		
		
	}

}
