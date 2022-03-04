package com.test;

//import java.awt.Checkbox;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisabledTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		WebElement check =driver.findElementByXPath("//label[@class='custom-control-label']");
		check.click();
		System.out.println(check.isDisplayed());
		System.out.println(check.isEnabled());
		System.out.println(check.isSelected());
	}

}
