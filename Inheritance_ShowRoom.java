package main;
import java.util.*;

class ShowRoom
{
	String name;
	long MobNo;
	double cost;
	double dis;
	double amount;
	
	public ShowRoom()
	{
		name="";
		MobNo=0;
		cost=0.0;
		dis=0.0;
		amount=0.0;
	}
		public void input()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Customer name=");
			name=s.nextLine();
			
			System.out.println("Enter the Mobile-Number=");
			MobNo=s.nextLong();
			
			System.out.println("Enter the cost of the items purchased=");
			cost=s.nextDouble();
		}
		
		void calculate()
		{
			double dis=0;
			if(cost<=10000)
			{
				dis=5;
				amount=cost-(cost*dis/100);
				
			}
			else if(cost<=20000)
			{
				dis=10;
				amount=cost-(cost*dis/100);
			}
			else if(cost<=35000)
			{
				dis=15;
				amount=cost-(cost*dis/100);
			}
			else if(cost>35000)
			{
				dis=20;
				amount=cost-(cost*dis/100);
			}
		}
		void display()
		{
			System.out.println("Customer name="+name);
			System.out.println("Mobile number="+MobNo);
			System.out.println("Amount to be paid after discound="+amount);
		}
		
	}

public class Inheritance_ShowRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShowRoom sr=new ShowRoom();
		sr.input();
		sr.calculate();
		sr.display();
	}

}
