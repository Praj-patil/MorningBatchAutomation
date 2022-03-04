package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testngexample {
	@BeforeSuite
	public void one()
	{
		System.out.println("hello i am one");
	}
	@AfterSuite
	public void two()
	{
		System.out.println("hello i am two");
	}
	@BeforeTest
	public void Three()
	{
		System.out.println("hello i am three");
	}
	public void Four()
	{
		System.out.println("hello i am four");
	}
	@BeforeClass
	public void five()
	{
		System.out.println("hello i am five");
	}
	@AfterClass
	public void six()
	{
		System.out.println("hello i am six");
	}
	@BeforeMethod
	public void seven()
	{
		System.out.println("hello i am seven");
	}
	@AfterMethod
	public void eight()
	{
		System.out.println("hello i am eight");
	}
	@Test
	public void nine()
	{
		System.out.println("hello i am nine");
	}
	

}
