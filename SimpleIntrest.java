package main;

class Bank1
{ 
	int P=2000,R=5,T=2;
	
	int simpleIntrest=(P*R*T)/100;
    
    public float rateofIntrest() 
      {
	     return simpleIntrest;
      }
}
class hdfc1 extends Bank1
{
  public float rateofIntrest() 
   {
	return super.rateofIntrest();
   }
}

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
				Bank1 b1=new Bank1();
				System.out.println(b1.rateofIntrest());
				
				hdfc1 b2=new hdfc1();
				System.out.println(b2.rateofIntrest());
	}

}
