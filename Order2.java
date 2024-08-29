package main;

public class Order2 {
	
	int id;
	String name;
	int Quantity;
	int Price;
	Order2(int i,String n,int q,int p)
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
 
		Order2 p1=new Order2(101,"Sting",5,25);
		p1.display();
		Order2 p2=new Order2(102,"Sprite",10,100);
		p2.display();
		
		Order2 p3=new Order2(103,"Coco_cola",2,50);
		p3.display();
		
		Order2 p4=new Order2(104,"Mstani",4,70);
		p4.display();
		
		
		
	}

}
