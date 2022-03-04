package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	     ChromeDriver driver= new ChromeDriver();
	     driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	     driver.manage().window().maximize();
	     System.out.println(driver.getTitle());
	     //WebElement button1= driver.findElementByXPath("//input[@name='alert']");
	     WebElement a =driver.findElement(By.xpath("//input[@name='confirmation']"));    
	     a.click();
	     Alert b= driver.switchTo().alert();
	    Thread.sleep(3000);
	     b.accept();
	     WebElement button2= driver.findElementByXPath("//button[@id='alertButton']");
	     button2.click();
	     Thread.sleep(3000);
	     b.accept();
	     WebElement button3= driver.findElementByXPath("//input[@name='prompt']");
	     button3.click();
	     Thread.sleep(3000);
	     b.accept();
	     
	     System.out.println(a.getText());
	   
	}

}
