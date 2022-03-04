package com.test;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class OrangeLogin {
	public static ChromeDriver driver;
	public static int i=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		OrangeLogin login=new OrangeLogin();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		login.snap();
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		login.snap();
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		login.snap();
			
			}
        	@Test
			public void snap() throws IOException
			{
				Random r=new Random();
				if(r.nextInt()!=0)
				{
					i=i+1;
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest=new File(".//images//pic"+i+".png");
				FileUtils.copyFile(src, dest);
				}
			}
	}


