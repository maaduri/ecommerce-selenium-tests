package com.staples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RelatedCat {
	
	
	@Test
	public void  menu()
	{
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\LatestChrome1\\ChromeDriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.staples.com/");
		
		driver.findElement(By.id("category-products")).click();
		//driver.findElements(By.xpath("//div[@id='products-flyout-0-content']//div[2]/div[3]//a"));
		
		//List<WebElement> list = driver.findElements(By.xpath("//div[@id='products-flyout-0-content']//div[2]/div[3]//*"));
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='products-flyout-0-content']//div[3]//span[1]//a"));// div[@id='products-flyout-0-content']//div[3]//span[1]
		System.out.println(list.size());

		  
		for(WebElement element:list)
		{
		  System.out.println(element.getText());
		}
		
		
	}

}
