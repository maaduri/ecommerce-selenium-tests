package com.apex.ecommerce.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ApexBaseTest {
	
	
    protected WebDriver driver= null;
    
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\LatestChrome1\\ChromeDriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://ecommerce.saipratap.net/customerlogin.php");
		 
	}
	@AfterMethod
	public void cleanup(){
		driver.close();
	}

}
