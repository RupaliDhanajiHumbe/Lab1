package com.anudip.mavenProject_jdbcCrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App             //JUnit
{
	
	/*public static int isPositive(int x)
	{
		 if(x>0)
		return x;
	}
	*/
	
	public static int cube(int x)
	{
		return x*x*x;
		
	}
	
	
	public static int addNumber(int a,int b)
	{
		return a+b;
	}
	
	
	public int maxElement(int arr[]) {
		int max=0;
		for(int i:arr) {
			if(i>max) {
				max=i;
			}
		}
		return max;
	}
	
	
    public static void main( String[] args )
    {

		System.out.println("Hello word...");
    }
}
