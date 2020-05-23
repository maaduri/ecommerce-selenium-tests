package com.apex.ecommerce.registration.order.page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.apex.ecommerce.registration.order.constant.*;
//import com.apex.ecommerce.registration.order.constant.OrderConstant;

//import com.apex.ecommerce.order.constant.OrderConstant;

public class OrderPage implements OrderConstant{
	
	@FindBy(id=EMAIL_ID_LOCATOR)
	WebElement emailElm;
	@FindBy(id=PASSWORD_ID_LOCATOR)
	WebElement passwordElm;
	@FindBy(linkText=LOGIN_LINK_LOCATOR)
	WebElement loginElm;
	@FindBy(linkText=PRODUCTS_LINK_LOCATOR)
	WebElement productsElm;
	@FindBy(css=VIEWITEM_LINK_LOCATOR)
	WebElement viewItemElm;
	@FindBy(css=ADD_TO_CART_LOCATOR)
	WebElement addToCartElm;
	@FindBy(css=CONTINUE_IMAGE_LOCATOR)
	WebElement continueElm;
	@FindBy(id=HOUSENO_ID_LOCATOR)
	WebElement housenoElm;
	@FindBy(id=ADDRESS_ID_LOCATOR)
	WebElement addressElm;
	@FindBy(id=CITY_ID_LOCATOR)
	WebElement cityElm;
	@FindBy(id=CODE_ID_LOCATOR)
	WebElement codeElm;
	@FindBy(id=STATE_ID_LOCATOR)
	WebElement stateElm;
	@FindBy(id=COUNTRY_ID_LOCATOR)
	WebElement countryElm;
	@FindBy(name=DCODE_NAME_LOCATOR)
	WebElement dcodeElm;
	@FindBy(linkText=CHECKOUT_LINK_LOCATOR)
	WebElement checkoutElm;
	@FindBy(xpath=SHIPOPT_BTN_LOCATOR)
	WebElement shippingOptionElm;
	@FindBy(name=SUBMIT_NAME_LOCATOR)
	WebElement submitElm;
	@FindBy(css=VIEWITEM_LOCATOR)
	WebElement viewItem1Elm;
	@FindBy(className=PRICETAG_CLASSNAME_LOCATOR)
	WebElement pricetagElm;
	//@FindBy(className=VIEWITEM3_LOCATOR)
	//WebElement viewItem3Elm;
	@FindBy(className=PRICE_CLASSNAME_LOCATOR)
	WebElement priceElm;
	

	
	private WebDriver orderPageDriver;
	public OrderPage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	orderPageDriver = driver;
	}
	
	public  void clickonPlaceOrder(String email,String pwd,String hno, String add, String city,
            String code,String state, String country) throws InterruptedException
      {

	    //Enter the first name
		emailElm.sendKeys(email);
		//Enter the last name
		passwordElm.sendKeys(pwd);
		//Enter the day value
		Thread.sleep(1000);
		//click on Login
		loginElm.click();
		//cick on Products 
		 productsElm.click();
		 //click on productItem
		 viewItemElm.click();
		 //click in Add to cart
		 addToCartElm.click();
		 //click on continue
		 continueElm.click();
		//click on productItem again 
		 viewItemElm.click();
		//click in Add to cart
		 addToCartElm.click();
		 //click on checkout
		 checkoutElm.click();
		//click on continue
		 continueElm.click();
		 //click on shipping option
		 shippingOptionElm.click();
		 //Enter houseno
		 housenoElm.sendKeys(hno);
		 //Enter address
		 addressElm.sendKeys(add);
		 //Enter city
		 cityElm.sendKeys(city);
		 //enter state
		 stateElm.sendKeys(state);
		 //Enter country
		 countryElm.sendKeys(country);
		//click on shipping option again
		 shippingOptionElm.click();
		 //Click on Submit
		 submitElm.click();
		//click on shipping option again
		 shippingOptionElm.click();
		 //click on continue
		 continueElm.click();
		//click on continue
		 continueElm.click();
		 //Click on dcode
		 dcodeElm.click();
		//click on continue
		 continueElm.click();
		 
	}
	
	public  void clickOnOrder(String email,String pwd) throws InterruptedException
      {

	    //Enter the first name
		emailElm.sendKeys(email);
		//Enter the password
		passwordElm.sendKeys(pwd);
		//Enter the day value
		Thread.sleep(1000);
		//click on Login
		loginElm.click();
		//cick on Products 
		 productsElm.click();
		 //click on productItem
		 viewItem1Elm.click();
		 
		 String str = orderPageDriver.getTitle();
		 System.out.println(str);
		 Assert.assertEquals("ecommerce.saipratap.net", str);
}
	
	 
	  public void productValueChnaged(String email, String pwd) throws InterruptedException {
		 
		    emailElm.sendKeys(email);
			//Enter the password name
			passwordElm.sendKeys(pwd);
			//Enter the day value
			Thread.sleep(1000);
			//click on Login
			loginElm.click();
			//cick on Products 
			 productsElm.click();
			 //chekc the price of the item
			 String text1 = pricetagElm.getText();
		     System.out.println(text1);
		     //Click on  viewItem
		     viewItemElm.click();
		     //click in Add to cart
			 addToCartElm.click();
			 String text2 = priceElm.getText();
		     System.out.println(text2);
		     System.out.println("Product value is changed");
				
				if(text1.equals(text2))
			    System.out.println("Test is not success");
				else
			    System.out.println("Test is  success");
		     
		     
		}
}
