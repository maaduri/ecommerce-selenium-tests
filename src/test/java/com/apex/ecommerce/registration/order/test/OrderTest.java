package com.apex.ecommerce.registration.order.test;

import org.testng.annotations.Test;

import com.apex.ecommerce.core.*;
import com.apex.ecommerce.registration.order.constant.OrderConstant;
import com.apex.ecommerce.registration.order.page.*;
import com.apex.ecommerce.registration.constant.RegistrationConstant;
import com.apex.ecommerce.registration.page.RegistrationPage;

public class OrderTest extends ApexBaseTest implements OrderConstant{
	
   @Test
	public void testwithValidData() throws InterruptedException
	{
	   OrderPage orderPage = new OrderPage(driver);
	   //perform the action
	   Thread.sleep(1000);
	   orderPage.clickonPlaceOrder("priya123@yahoo.com", "paper","456","style","dublin","12345",
						                  "CA","USA");
     }
    
    @Test
	public void productsarenotDiplayed() throws InterruptedException
	{
	   OrderPage orderPage = new OrderPage(driver);
	   //perform the action
	   Thread.sleep(1000);
	   orderPage.clickOnOrder("arun@yahoo.com", "arun123");
						                 
     }
    
    @Test
   	public void productValueisChanged() throws InterruptedException
   	{
   	   OrderPage orderPage = new OrderPage(driver);
   	   
   	   //perform the action
   	   Thread.sleep(1000);
   	   orderPage.productValueChnaged("arun@yahoo.com", "arun123");
   						                 
        }
       

}
