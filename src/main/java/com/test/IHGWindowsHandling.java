package com.test;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IHGWindowsHandling {
	public static String parent,facebook,twitter;
	public static Set<String> all;
	public static Iterator<String> i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("prajakta");	
		driver.findElement(By.xpath("//input[@id='f=lastName']")).sendKeys("patil");	
		driver.findElement(By.xpath("//a[text()[contains(.,'Explore the many benefits')]]"));
		
		driver.findElement(By.xpath("//img[@class='fa']"));
		//
		all = driver.getWindowHandles();
		java.util.Iterator<String> i = all.iterator();
		while(i.hasNext())
		{
			facebook=i.next();
			if(!parent.equals(facebook))
			{
				driver.switchTo().window(facebook);
			}
		}
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	


	}

}
