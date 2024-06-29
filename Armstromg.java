package main;

import java.util.*;

public class Armstromg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		  Scanner s=new Scanner(System.in);
		  System.out.println("enter the number=");
		  int n=s.nextInt();
		  int sum=0;
		  int r;
		  int temp;
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


