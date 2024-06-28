import java.io.*;
import java.util.*;
class Arm
{ 
   int n,r,sum=0,temp;
  Scanner s=new Scanner(System.in);
  void get()
  {
     System.out.println("enter the number=");
     n=s.nextInt();
  }
void display()
{
  temp=n;
  while(n>0)
  {
    r=n%10;
    sum=sum+(r*r*r);
    n=n/10;
}
 if(sum==temp)
      System.out.println(temp+" is Armstrong number");
else
     System.out.println(temp+" is not Armstrong number");
  }
}
class Armstrong
{
  public static void main(String arg[])
   {
      Arm a=new Arm();
      a.get();
      a.display();
   }
}