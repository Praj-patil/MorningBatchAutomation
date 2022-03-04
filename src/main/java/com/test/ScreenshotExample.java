package com.test;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotExample {
public static	ChromeDriver driver;
	public static int i=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		ScreenshotExample sc= new ScreenshotExample();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		WebElement radio=driver.findElementByXPath("//label[@class='custom-control-label']");
		radio.click();
		sc.snap();
		System.out.println("screenshoot taken");
		
		
	}
	@Test
 public  void snap() throws IOException
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
