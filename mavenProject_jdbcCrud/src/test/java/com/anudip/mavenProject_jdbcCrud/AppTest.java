package com.anudip.mavenProject_jdbcCrud;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest 
{
	@BeforeClass
	public static void setUp()
	{
		System.out.println("Intialized all resources");
	}
	@Before
	public void beforeEachTest()
	{
		System.out.println("It will execute before each test case");
	}

	/*@Test
	public void testPositiveNumber()
	{
		assertFalse("the number is positive",App.isPisitive(-5));
	}*/
	
	
	@Test
	   public void checkCube()
	   {
		assertEquals(27,App.cube(3));
	   }

	
	@Test 
	public void testAddition()
	{
		assertEquals(5,App.addNumber(2,3));
	}
	
	
	@Test
	public void MaxNumber()
	{
		int[] arr= {6,15,10,12,25};
		App a=new App();
		assertEquals(25,a.maxElement(arr));
	}
	
	
	@AfterClass
	public static void cleanUp()
	{
		System.out.println("close the connection");
	}
	@After
	public void afteEachTest()
	{
		System.out.println("It will execute after each test case");
	}

}
