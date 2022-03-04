package com.test;

import java.util.Set;
import java.util.Iterator;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsOrangeHRM {
public static String Parent,FB,LinkedIn,twitter;
 Set<String> all;Iterator<String> i;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	     ChromeDriver driver= new ChromeDriver();
	     driver.get("https://opensource-demo.orangehrmlive.com/");
	     driver.manage().window().maximize();
	     System.out.println(driver.getTitle());
	     String parent = driver.getWindowHandle();
	     driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	     driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	     Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id='social-icons']/a[1]/img")).click();
	   Set<String> all = driver.getWindowHandles();
	   Iterator<String> i= 	 all.iterator();
	   while(i.hasNext())
	   {
		LinkedIn =i.next();
		  if(!parent.equals(LinkedIn))
		  {
			  driver.switchTo().window(LinkedIn);
			  
			  
		  }
	   } 
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());	
    Thread.sleep(3000);
	   //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("prajakta");
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("prajakta123");
	   Thread.sleep(3000); 
	driver.switchTo().window(parent);
	   System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());	
	    
	    driver.findElement(By.xpath(" //img[@alt[starts-with(.,'OrangeHRM on Facebook')]]  ")).click();
	     all = driver.getWindowHandles();
		   i= 	 all.iterator();
		   while(i.hasNext())
		   {
			   FB=i.next();
			  if(!parent.equals(FB))
			  {
				  driver.switchTo().window(FB);
				  
				  
			  }
		   } 
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());	
	    
	}

}
