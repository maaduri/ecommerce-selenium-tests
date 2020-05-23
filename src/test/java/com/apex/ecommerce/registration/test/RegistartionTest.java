package com.apex.ecommerce.registration.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;
import com.apex.ecommerce.registration.constant.RegistrationConstant;
import com.apex.ecommerce.registration.page.RegistrationPage;



public class RegistartionTest extends ApexBaseTest implements RegistrationConstant{
	//RegistrationPage registrationPage = new RegistrationPage(driver);
	
      	/*@Test
		public void testwithValidData() throws InterruptedException
		{
      		RegistrationPage registrationPage = new RegistrationPage(driver);
      		//perform the action
			Thread.sleep(1000);
			registrationPage.clickonSignupBtn("kathy", "baker","01","02","1992","kathybuny@yahoo.com","444",
					                           "Arlington blvd","Dublin","New york","USA","73827","6346324","83246",
					                           "john123","john123");
	    }*/

      	@Test
		public void testwithoutTermsandConditions() throws InterruptedException
		{
      		RegistrationPage registrationPage = new RegistrationPage(driver);
      		//perform the action
      		registrationPage.clickonSignupBtnWithoutTermsConditions("Ankith", "batia","01","02","1992","nkiihu1@yahoo.com","444",
                                                                     "Arlington blvd","Dublin","New york","USA","73827","6346324","83246",
                                                                     "ankith123","ankith123");
      	}
      	
      	@Test
		public void testwithoutEmail() throws InterruptedException
		{
      		RegistrationPage registrationPage = new RegistrationPage(driver);
      		//perform the action
      		registrationPage.clickonSignupBtnWithoutEmail("Karthi", "chennei","01","02","1986","444",
                                                          "Arlington blvd","Dublin","New york","USA","73827","6346324","83246",
                                                           "karthi123","karthi123");
      	}


}
