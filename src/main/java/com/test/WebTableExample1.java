package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/table");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement table = driver.findElement(By.xpath("//table[@id='webtable']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for(int i=2;i<rows.size();i++)
		{
			List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cells.size();j++)
			{
				String name="";
				name=cells.get(j).getText();
				if(name.equalsIgnoreCase("Google"))
				{
					System.out.println(cells.get(2).getText());
				}
			}
		}
		
		
	} //Title=js.executeScript("return document.title;").toString();

}
